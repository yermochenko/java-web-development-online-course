package by.vsu.example.general.app;

import by.vsu.example.general.config.MenuItem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Menu {
	private final List<MenuItem> menuItems;

	public Menu(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public void showMenu() {
		int i = 1;
		for(MenuItem menuItem : menuItems) {
			System.out.println((i++) + ". " + menuItem.getName());
		}
	}

	public void execute(int index) {
		try {
			MenuItem menuItem = menuItems.get(index);
			Class<?> c = Class.forName(menuItem.getClassName());
			Constructor<?> constructor = c.getConstructor();
			Object obj = constructor.newInstance();
			Method method = c.getMethod(menuItem.getMethodName());
			method.invoke(obj);
		} catch(ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}
}

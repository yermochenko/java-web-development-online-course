package by.vsu.example.general.app;

import by.vsu.example.general.config.MenuItem;

import java.util.List;
import java.util.Scanner;

public class App {
	private List<MenuItem> menuItems;

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu(menuItems);
		while(true) {
			menu.showMenu();
			System.out.println();
			System.out.print("Введите номер выбранного пункта: ");
			int index = Integer.parseInt(scanner.nextLine()) - 1;
			menu.execute(index);
		}
	}
}

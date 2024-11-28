package by.vsu.example.usage.ui;

import by.vsu.example.general.app.Validator;
import by.vsu.example.usage.domain.Author;
import by.vsu.example.usage.storage.AuthorStorage;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class AuthorUI {
	public void list() {
		List<Author> authors = AuthorStorage.read();
		System.out.println("Список авторов:");
		for(Author author : authors) {
			System.out.println(author);
		}
	}

	public void add() throws IntrospectionException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		Author author = Validator.validate(Author.class);
		if(author != null) {
			AuthorStorage.create(author);
			System.out.println("Автор успешно добавлен");
		} else {
			System.out.println("Автор не добавлен");
		}
	}
}

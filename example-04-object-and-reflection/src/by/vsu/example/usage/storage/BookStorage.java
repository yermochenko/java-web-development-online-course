package by.vsu.example.usage.storage;

import by.vsu.example.usage.domain.Book;

import java.util.*;

public class BookStorage {
	private static final Map<Integer, Book> books = new HashMap<>();

	public static void create(Book book) {
		Integer id;
		if(!books.keySet().isEmpty()) {
			id = Collections.max(books.keySet());
		} else {
			id = 0;
		}
		id++;
		book.setId(id);
		books.put(id, book);
	}

	public static List<Book> readByAuthor(Integer authorId) {
		List<Book> result = new ArrayList<>();
		for(Book book : books.values()) {
			if(book.getAuthor().getId().orElse(0).equals(authorId)) {
				result.add(book);
			}
		}
		result.sort(new BookComparator());
		return result;
	}

	public static Book read(Integer id) {
		return books.get(id);
	}

	public static void update(Book book) {
		if(book.getId().isPresent()) {
			Integer id = book.getId().get();
			if(books.containsKey(id)) {
				books.put(id, book);
			}
		}
	}

	public static void delete(Integer id) {
		books.remove(id);
	}

	private static class BookComparator implements Comparator<Book> {
		@Override
		public int compare(Book b1, Book b2) {
			return b1.getTitle().compareTo(b2.getTitle());
		}
	}
}

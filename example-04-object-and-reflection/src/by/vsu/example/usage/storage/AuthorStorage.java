package by.vsu.example.usage.storage;

import by.vsu.example.usage.domain.Author;

import java.util.*;

public class AuthorStorage {
	private static final Map<Integer, Author> authors = new HashMap<>();

	static {
		create(author("Иван", "Иванович", "Иванов", 1920, 1968));
		create(author("Пётр", null, "Петров", 1980, null));
		create(author("Сидоров", null, "Василий", 1815, 1845));
	}

	public static void create(Author author) {
		Integer id;
		if(!authors.keySet().isEmpty()) {
			id = Collections.max(authors.keySet());
		} else {
			id = 0;
		}
		id++;
		author.setId(id);
		authors.put(id, author);
	}

	public static List<Author> read() {
		List<Author> result = new ArrayList<>(authors.values());
		result.sort(new AuthorComparator());
		return result;
	}

	public static Author read(Integer id) {
		return authors.get(id);
	}

	public static void update(Author author) {
		if(author.getId().isPresent()) {
			Integer id = author.getId().get();
			if(authors.containsKey(id)) {
				authors.put(id, author);
			}
		}
	}

	public static void delete(Integer id) {
		authors.remove(id);
	}

	private static class AuthorComparator implements Comparator<Author> {
		@Override
		public int compare(Author a1, Author a2) {
			int result = a1.getLastName().compareTo(a2.getLastName());
			if(result == 0) {
				result = a1.getFirstName().compareTo(a2.getFirstName());
			}
			return result;
		}
	}

	private static Author author(String firstName, String middleName, String lastName, Integer birthYear, Integer deathYear) {
		Author author = new Author();
		author.setFirstName(firstName);
		author.setMiddleName(middleName);
		author.setLastName(lastName);
		author.setBirthYear(birthYear);
		author.setDeathYear(deathYear);
		return author;
	}
}

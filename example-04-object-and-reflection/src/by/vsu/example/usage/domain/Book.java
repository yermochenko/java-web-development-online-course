package by.vsu.example.usage.domain;

public class Book extends Entity {
	private String title;
	private Author author;
	private String publisher;
	private Integer publishYear;
	private Integer pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id='" + getId() +
				", title='" + getTitle() + '\'' +
				", author=" + getAuthor() +
				", publisher='" + getPublisher() + '\'' +
				", publishYear=" + getPublishYear() +
				", pages=" + getPages() +
				'}';
	}
}

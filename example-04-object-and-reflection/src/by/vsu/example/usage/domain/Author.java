package by.vsu.example.usage.domain;

public class Author extends Entity {
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer birthYear;
	private Integer deathYear;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(Integer deathYear) {
		this.deathYear = deathYear;
	}

	@Override
	public String toString() {
		return "Author{" +
				"id=" + getId() +
				", firstName='" + getFirstName() + '\'' +
				", middleName='" + getMiddleName() + '\'' +
				", lastName='" + getLastName() + '\'' +
				", birthYear=" + getBirthYear() +
				", deathYear=" + getDeathYear() +
				'}';
	}
}

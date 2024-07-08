package part1.b;

import java.util.Date;

public class User {
	private final Integer id;
	private final String username;
	private final String password;
	private final String email;
	private final String role;
	private final Date birthday;
	private final Double weight;
	private final boolean active;

	public User(Integer id, String username, String password, String email, String role, Date birthday, Double weight, boolean active) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.birthday = birthday;
		this.weight = weight;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public Date getBirthday() {
		return birthday;
	}

	public Double getWeight() {
		return weight;
	}

	public boolean isActive() {
		return active;
	}
}

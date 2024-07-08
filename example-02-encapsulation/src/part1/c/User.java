package part1.c;

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

	private User(Integer id, String username, String password, String email, String role, Date birthday, Double weight, boolean active) {
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

	public static class Builder {
		private Integer id;
		private String username;
		private String password;
		private String email;
		private String role;
		private Date birthday;
		private Double weight;
		private boolean active;
		public Builder setId(Integer id) {
			this.id = id;
			return this;
		}
		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}
		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		public Builder setRole(String role) {
			this.role = role;
			return this;
		}
		public Builder setBirthday(Date birthday) {
			this.birthday = birthday;
			return this;
		}
		public Builder setWeight(Double weight) {
			this.weight = weight;
			return this;
		}
		public Builder setActive(boolean active) {
			this.active = active;
			return this;
		}
		public User create() {
			return new User(id, username, password, email, role, birthday, weight, active);
		}
	}
}

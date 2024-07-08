package part1.a;

import java.util.Date;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String role;
	private Date birthday;
	private Double weight;
	private boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getWeight() {
		return weight;
	}

	/**
	 * Метод, задающий значение веса пользователя
	 * @param weight вес (должен быть положительным)
	 * @throws Exception если вес меньше либо равен нуля
	 */
	public void setWeight(Double weight) throws Exception {
		if(weight > 0) {
			this.weight = weight;
		} else {
			// 1. Write default value (this.weight = Math.abs(weight)
			// 2. Do nothing
			// 3. return false;
			/* 4. */ throw new Exception("error");
		}
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}

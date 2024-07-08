package part1.d;

import java.util.Date;

public record User(
		Integer id,
		String username,
		String password,
		String email,
		String role,
		Date birthday,
		Double weight, boolean active) {
	public String email() {
		System.out.println("DEBUG");
		return email;
	}
}

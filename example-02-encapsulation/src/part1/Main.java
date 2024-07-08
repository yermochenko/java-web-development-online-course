package part1;

import part1.c.User;

import java.util.Calendar;
import java.util.Date;

public class Main {
	static Date date(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		return cal.getTime();
	}
	public static void main(String[] args) throws Exception {
		part1.a.User user1 = new part1.a.User();
		user1.setUsername("user1");
		user1.setPassword("password1");
		user1.setEmail("email1@vsu.by");
		user1.setBirthday(date(23, Calendar.OCTOBER, 2001));
		user1.setWeight(123.0);
		System.out.println(user1);

		part1.b.User user2 = new part1.b.User(null, "user2", "12345", "user@mail.ru", null, date(23, Calendar.OCTOBER, 2001), 89.0, false);
		System.out.println(user2);

		part1.c.User.Builder userBuilder = new User.Builder();
		userBuilder.setUsername("user3");
		userBuilder.setPassword("qwerty");
		userBuilder.setEmail("user@gmail.com");
		userBuilder.setBirthday(date(18, Calendar.JANUARY, 2003));
		userBuilder.setWeight(98.0);
		part1.c.User user3 = userBuilder.create();
		System.out.println(user3);

		part1.c.User user4 = new User.Builder().setUsername("user3").setPassword("qwerty").setEmail("user@gmail.com").setBirthday(date(23, Calendar.JANUARY, 2003)).setWeight(98.0).create();
		System.out.println(user4);
	}
}

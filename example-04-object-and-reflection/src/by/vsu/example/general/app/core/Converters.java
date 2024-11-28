package by.vsu.example.general.app.core;

public class Converters {
	public static String convertFromString(String value) {
		if(!value.isBlank()) {
			return value.trim();
		} else {
			return null;
		}
	}

	public static Integer convertFromInteger(String value) {
		try {
			return Integer.valueOf(value.trim());
		} catch(NumberFormatException e) {
			return null;
		}
	}
}

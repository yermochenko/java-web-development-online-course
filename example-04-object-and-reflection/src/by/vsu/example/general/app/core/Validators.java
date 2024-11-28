package by.vsu.example.general.app.core;

public class Validators {
	public static boolean notEmpty(String value) {
		return !value.isBlank();
	}

	public static boolean isInteger(String value) {
		try {
			Integer.parseInt(value.trim());
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}

	public static boolean isEmptyOrInteger(String value) {
		return !notEmpty(value) || isInteger(value);
	}
}

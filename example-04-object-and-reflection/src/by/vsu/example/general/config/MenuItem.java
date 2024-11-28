package by.vsu.example.general.config;

public class MenuItem {
	private final String name;
	private final String className;
	private final String methodName;

	public MenuItem(String name, String className, String methodName) {
		this.name = name;
		this.className = className;
		this.methodName = methodName;
	}

	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}

	public String getMethodName() {
		return methodName;
	}
}

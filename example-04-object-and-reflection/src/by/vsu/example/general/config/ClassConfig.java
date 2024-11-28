package by.vsu.example.general.config;

import java.util.Objects;

public class ClassConfig {
	private final String className;
	private final FieldConfig[] fieldConfigs;
	private final String title;

	public ClassConfig(String className, FieldConfig[] fieldConfigs, String title) {
		this.className = Objects.requireNonNull(className);
		this.fieldConfigs = Objects.requireNonNull(fieldConfigs);
		this.title = Objects.requireNonNull(title);
	}

	public String getClassName() {
		return className;
	}

	public FieldConfig[] getFieldConfigs() {
		return fieldConfigs;
	}

	public String getTitle() {
		return title;
	}
}

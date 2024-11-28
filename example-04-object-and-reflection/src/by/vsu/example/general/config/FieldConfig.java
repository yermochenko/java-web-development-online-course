package by.vsu.example.general.config;

import java.util.Objects;

public class FieldConfig {
	private final String name;
	private final Class<?> type;
	private final String label;
	private final ValidatorConfig[] validatorConfigs;
	private final ConverterConfig converterConfig;

	public FieldConfig(String name, Class<?> type, String label, ConverterConfig converterConfig) {
		this(name, type, label, new ValidatorConfig[0], converterConfig);
	}

	public FieldConfig(String name, Class<?> type, String label, ValidatorConfig[] validatorConfigs, ConverterConfig converterConfig) {
		this.name = Objects.requireNonNull(name);
		this.type = Objects.requireNonNull(type);
		this.label = Objects.requireNonNull(label);
		this.validatorConfigs = Objects.requireNonNull(validatorConfigs);
		this.converterConfig = Objects.requireNonNull(converterConfig);
	}

	public String getName() {
		return name;
	}

	public Class<?> getType() {
		return type;
	}

	public String getLabel() {
		return label;
	}

	public ValidatorConfig[] getValidatorConfigs() {
		return validatorConfigs;
	}

	public ConverterConfig getConverterConfig() {
		return converterConfig;
	}

	public static class ValidatorConfig {
		private final String className;
		private final String methodName;

		public ValidatorConfig(String className, String methodName) {
			this.className = Objects.requireNonNull(className);
			this.methodName = Objects.requireNonNull(methodName);
		}

		public String getClassName() {
			return className;
		}

		public String getMethodName() {
			return methodName;
		}
	}

	public static class ConverterConfig {
		private final String className;
		private final String methodName;

		public ConverterConfig(String className, String methodName) {
			this.className = Objects.requireNonNull(className);
			this.methodName = Objects.requireNonNull(methodName);
		}

		public String getClassName() {
			return className;
		}

		public String getMethodName() {
			return methodName;
		}
	}
}

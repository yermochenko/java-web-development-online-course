package by.vsu.example.general.app;

import by.vsu.example.general.config.ClassConfig;
import by.vsu.example.general.config.FieldConfig;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Validator {
	private static final Map<Class<?>, ClassConfig> classes = new HashMap<>();

	@SuppressWarnings("unchecked")
	public static <T> T validate(Class<T> c) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException, IntrospectionException {
		ClassConfig classConfig = classes.get(c);
		if(classConfig != null) {
			Constructor<?> constructor = c.getConstructor();
			Object obj = constructor.newInstance();
			System.out.println(classConfig.getTitle());
			Scanner console = new Scanner(System.in);
			for(FieldConfig fieldConfig : classConfig.getFieldConfigs()) {
				System.out.print(fieldConfig.getLabel() + ": ");
				String input = console.nextLine();
				for(FieldConfig.ValidatorConfig validatorConfig : fieldConfig.getValidatorConfigs()) {
					Class<?> validatorClass = Class.forName(validatorConfig.getClassName());
					Method method = validatorClass.getMethod(validatorConfig.getMethodName(), String.class);
					boolean isValid = (Boolean) method.invoke(null, input);
					if(!isValid) {
						System.out.println("Ошибочное значение поля");
						return null;
					}
				}
				FieldConfig.ConverterConfig converterConfig = fieldConfig.getConverterConfig();
				Class<?> converterClass = Class.forName(converterConfig.getClassName());
				Method method = converterClass.getMethod(converterConfig.getMethodName(), String.class);
				Object value = method.invoke(null, input);
				if(value != null) {
					new PropertyDescriptor(fieldConfig.getName(), c).getWriteMethod().invoke(obj, value);
				}
			}
			return (T) obj;
		} else {
			return null;
		}
	}

	public static void registerClass(ClassConfig config) throws ClassNotFoundException {
		Class<?> c = Class.forName(config.getClassName());
		classes.put(c, config);
	}
}

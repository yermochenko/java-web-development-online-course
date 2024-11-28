package by.vsu.example.usage;

import by.vsu.example.general.app.App;
import by.vsu.example.general.app.Validator;
import by.vsu.example.general.config.ClassConfig;
import by.vsu.example.general.config.FieldConfig;
import by.vsu.example.general.config.MenuItem;

import java.util.List;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		Validator.registerClass(new ClassConfig(
			"by.vsu.example.usage.domain.Author",
			new FieldConfig[] {
				new FieldConfig(
					"firstName",
					String.class,
					"Введите имя автора",
					new FieldConfig.ValidatorConfig[] {
						new FieldConfig.ValidatorConfig("by.vsu.example.general.app.core.Validators", "notEmpty")
					},
					new FieldConfig.ConverterConfig("by.vsu.example.general.app.core.Converters", "convertFromString")
				),
				new FieldConfig(
					"middleName",
					String.class,
					"Введите отчество автора",
					new FieldConfig.ConverterConfig("by.vsu.example.general.app.core.Converters", "convertFromString")
				),
				new FieldConfig(
					"lastName",
					String.class,
					"Введите фамилию автора",
					new FieldConfig.ValidatorConfig[] {
						new FieldConfig.ValidatorConfig("by.vsu.example.general.app.core.Validators", "notEmpty")
					},
					new FieldConfig.ConverterConfig("by.vsu.example.general.app.core.Converters", "convertFromString")
				),
				new FieldConfig(
					"birthYear",
					Integer.class,
					"Введите год рождения автора",
					new FieldConfig.ValidatorConfig[] {
						new FieldConfig.ValidatorConfig("by.vsu.example.general.app.core.Validators", "isInteger")
					},
					new FieldConfig.ConverterConfig("by.vsu.example.general.app.core.Converters", "convertFromInteger")
				),
				new FieldConfig(
					"deathYear",
					Integer.class,
					"Введите год смерти автора",
					new FieldConfig.ValidatorConfig[] {
						new FieldConfig.ValidatorConfig("by.vsu.example.general.app.core.Validators", "isEmptyOrInteger")
					},
					new FieldConfig.ConverterConfig("by.vsu.example.general.app.core.Converters", "convertFromInteger")
				),
			},
			"Для добавления нового автора введите значение его полей:"
		));
		App app = new App();
		app.setMenuItems(List.of(
			new MenuItem("Просмотр списка авторов", "by.vsu.example.usage.ui.AuthorUI", "list"),
			new MenuItem("Добавление автора", "by.vsu.example.usage.ui.AuthorUI", "add")
		));
		app.run();
	}
}

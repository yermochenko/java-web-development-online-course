package part3;

import java.util.Calendar;

public class Main {
	public static Product buildProduct(String name, Integer price) {
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);
		return product;
	}

	public static Sale buildSale(Client client, Product product, int day, int month, int year) {
		Sale sale = new Sale();
		sale.setClient(client);
		sale.setProduct(product);
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		sale.setDate(calendar.getTime());
		return sale;
	}

	public static void main(String[] args) {
		Product[] products = {
				buildProduct("Milk", 1_00),
				buildProduct("Cheese", 2_00),
				buildProduct("Pepsi", 1_50)
		};
		Client client = new Client();
		client.setName("Иванов Иван Иванович");
		client.setContact("ivanov@gmail.com");
		client.setSales(new Sale[] {
				buildSale(client, products[0], 1, Calendar.OCTOBER, 2023),
				buildSale(client, products[1], 28, Calendar.APRIL, 2024),
				buildSale(client, products[1], 30, Calendar.APRIL, 2024),
				buildSale(client, products[0], 1, Calendar.MAY, 2024),
				buildSale(client, products[2], 15, Calendar.MAY, 2024),
				buildSale(client, products[0], 20, Calendar.MAY, 2024),
		});
		System.out.println(client.getName() + " (" + client.getContact() + "), discount: " + client.getDiscount() * 100 + "%");
		client.setSales(new Sale[] {
				buildSale(client, products[0], 1, Calendar.OCTOBER, 2023),
				buildSale(client, products[1], 28, Calendar.APRIL, 2024),
				buildSale(client, products[1], 30, Calendar.APRIL, 2024),
				buildSale(client, products[0], 1, Calendar.MAY, 2024),
				buildSale(client, products[2], 15, Calendar.MAY, 2024),
				buildSale(client, products[0], 20, Calendar.MAY, 2024),
				buildSale(client, products[1], 21, Calendar.MAY, 2024),
				buildSale(client, products[1], 22, Calendar.MAY, 2024),
				buildSale(client, products[1], 23, Calendar.MAY, 2024),
				buildSale(client, products[1], 24, Calendar.MAY, 2024),
		});
		System.out.println(client.getName() + " (" + client.getContact() + "), discount: " + client.getDiscount() * 100 + "%");
	}
}

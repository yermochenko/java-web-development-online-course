package part3;

import java.util.Calendar;
import java.util.Date;

public class Client {
	private String name;
	private String contact;
	private Sale[] sales;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Sale[] getSales() {
		return sales;
	}

	public void setSales(Sale[] sales) {
		this.sales = sales;
		discount = null;
	}

	private Double discount;

	public double getDiscount() {
		if(discount == null) {
			discount = calcDiscount();
		}
		return discount;
	}

	private double calcDiscount() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -31);
		date = cal.getTime();
		int sum = 0;
		for(Sale sale : sales) {
			if(sale.getDate().after(date)) {
				sum += sale.getProduct().getPrice();
			}
		}
		int n = sum / 200;
		if(n <= 15) {
			return n / 100.0;
		}
		return 0.15;
	}
}

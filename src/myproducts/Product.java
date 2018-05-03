package myproducts;

public class Product {

	private String name;
	private int price;
	private int taxPercent;
	
	public Product(String name2, int price2, int taxPercent2) {
		// TODO Auto-generated constructor stub
	}

	public int getPriceWithTax() {
		
		return price+(price*taxPercent/100);
	}

	public String toString() {
		return "Product [name=" + name +";"
	}
	

}

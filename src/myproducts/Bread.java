package myproducts;

public class Bread extends Product{
	
	private double size;

	public Bread (String name, int price, int taxPercent, double size) {
		super(name, price, taxPercent);
		this.size = size;
	}

	public double getsize() {
		return size;
	}
	
	public int getWeightedPrice() {
		return (int) (getPriceWithTax()/size);
	}

	public String toString() {
		return "Bread [size=" + size + ", toString()=" + super.toString()
				+ "]";
	}
	
	public static boolean compareBreads(Bread bread1, Bread bread2) {
		if (bread1.getWeightedPrice() > bread2.getWeightedPrice()) {
			return true;
		}
		
		else return false;
	}

}

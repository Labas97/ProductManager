package myproducts;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product("Kakao", 200, 27);
		Bread bread = new Bread("Rozs", 250, 14, 0.75);
		System.out.println(product+ " "+ bread);
		
		Product product2 = new Bread("Feher", 200, 14, 1);
		System.out.println(product2);
		
		if (Bread.compareBreads(Bread) product2, bread2) {
			System.out.println(bread2);
		}
		
	}

}

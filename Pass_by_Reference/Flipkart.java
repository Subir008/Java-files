package Pass_by_Reference;

class Seller{
	void selling1() {
		System.out.println("T-shirt");
	}
	
	void selling2() {
		System.out.println("Jeans");
	}
}

public class Flipkart {

	public static void main(String[] args) {
		Seller s = new Seller();
		Buyer.buying(s);
		Buyer b = new Buyer();
		b.buying1(s);

	}
}

class Buyer{
	static void buying(Seller s) {
		s.selling1();
	}
	
	void buying1(Seller s) {
		s.selling2();
	}
}

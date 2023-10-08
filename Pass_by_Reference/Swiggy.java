package Pass_by_Reference;

class Shop{
	void food() {
		System.out.println("Chinese");
	}
}

public class Swiggy {

	public static void main(String[] args) {
		Shop s = new Shop();
		Customer1.hungry1(s);
		Customer1 c1 = new Customer1();
		c1.hungry(s);
	}
}

class Customer1{
	void hungry(Shop s) {
		s.food();
	}
	
	static void hungry1(Shop s) {
		s.food();
	}
}

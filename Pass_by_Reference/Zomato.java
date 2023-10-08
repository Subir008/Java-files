package Pass_by_Reference;

class Restaurent{
	void food() {
		System.out.println("Biriyani");
	}
}

public class Zomato {

	public static void main(String[] args) {
		Restaurent r = new Restaurent ();
		Customer c = new Customer();
		c.user1(r);
		Customer.user2(r);
	}
}

class Customer{
	void user1(Restaurent r) {
		r.food();
	}
	
	static void user2(Restaurent r) {
		r.food();
	}
}
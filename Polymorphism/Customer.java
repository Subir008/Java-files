package Polymorphism;


class Restaurent{
	void food ()
	{
		System.out.println("Menu list");
	}
}

class Veg extends Restaurent{
	void food ()
	{
		System.out.println("Paneer");
	}
}

class Nonveg extends Restaurent {
	void food ()
	{
		System.out.println("Chicken Biriyai");
	}
}

class Chinese extends Restaurent {
	void food () 
	{
		System.out.println("Noodles");
	}
}

class Waiter{
	static void serve (Restaurent r1)
	{
		r1.food();
	}
}

public class Customer {

	public static void main(String[] args) {
		Veg v1 = new Veg ();
		Nonveg n1 = new Nonveg();
		Chinese c1 = new Chinese ();
		Waiter.serve(c1);
		Waiter.serve(n1);
		Waiter.serve(v1);
	}

}


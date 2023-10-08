package Typecasting;

class Wings{
	void fly() {
		System.out.println("Bird is flying");
	}
}

class Leg extends Wings{
	void seating() {
		System.out.println("Birds sit on the tree");
	}
}

public class Bird {

	public static void main(String[] args) {
		System.out.println("*** Upcasting ***");
		Wings w1 = new Leg();
		w1.fly();
		
		System.out.println("*** Downcasting ***");
		Leg l1 = (Leg) w1;
		l1.fly();
		l1.seating();
		
	}

}

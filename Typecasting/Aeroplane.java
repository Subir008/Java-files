package Typecasting;

class Runway{
	void wheel() {
		System.out.println("In the runway waiting");
	}
}

class Flying extends Runway{
	void wings() {
		System.out.println("On air for the destination");
	}
}

public class Aeroplane {

	public static void main(String[] args) {
		System.out.println("*** Upcasting ***");
		Runway r1 = new Flying();
		r1.wheel();
		
		System.out.println("*** Downcasting ***");
//		Flying f1 = (Flying) new Flying();
		Flying f1 = (Flying) r1;
		f1.wheel();
		f1.wings();
		
	}

}

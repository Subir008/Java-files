package Typecasting;

class Cycling{
	void going() {
		System.out.println("Going for ride");
	}
}

class Standing extends Cycling{
	void standing() {
		System.out.println("Waiting for friend");
	}
}

public class Cycle {

	public static void main(String[] args) {
		System.out.println("*** Upcasting ***");
		Cycling c1 = new Standing();
		c1.going();
		
		System.out.println("*** Downcasting ***");
		Standing s1 = (Standing) new Standing();
		s1.standing();
		s1.going();
	}

}

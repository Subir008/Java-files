package Typecasting;

class Turn{
	void drive() {
		System.out.println("Car is taking a turn");
	}
}

class Indi extends Turn{
	void ind() {
		System.out.println("Indicator is turned on");
	}
}

public class Car {

	public static void main(String[] args) {
		System.out.println("*** Upcasting ***");
		Turn t1 = new Indi();
		t1.drive();
		
		System.out.println("*** Downcasting ***");
		Indi i1 =(Indi) t1;
		i1.ind();
		i1.drive();
	}

}

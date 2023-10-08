package Typecasting;

class Driving{
	void drive() {
		System.out.println("Going for ride");
	}
}

class Starting extends Driving{
	void start() {
		System.out.println("Kicking for starting the bike");
	}
}

public class Bike1 {

	public static void main(String[] args) {
		System.out.println("*** Upcasting ***");
		Driving d1 = new Starting();
		d1.drive();
		
		System.out.println("*** Downcasting ***");
		Starting s1 = (Starting) d1;
		s1.start();
		s1.drive();
	}

}

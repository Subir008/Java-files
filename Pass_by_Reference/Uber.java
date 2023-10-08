package Pass_by_Reference;

class Cab{
	void seat() {
		System.out.println("3 Seater");
	}
}

public class Uber {

	public static void main(String[] args) {
		Cab c = new Cab();
		Passenger.passenger2(c);
		Passenger p = new Passenger();
		p.passenger1(c);
	}
}

class Passenger{
	void passenger1(Cab c) {
		c.seat();
	}
	
	static void passenger2(Cab c) {
		c.seat();
	}
}
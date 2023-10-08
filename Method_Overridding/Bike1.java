package Method_Overridding;

class Fuel{
	void type() {
		System.out.println("Use petrol as refuling");
	}
}

class Fuel1 extends Fuel{
	void type() {
		super.type();
		System.out.println("Use electricity as refuling");
	}
}

public class Bike1 {

	public static void main(String[] args) {
		Fuel1 f1 = new Fuel1();
		f1.type();

	}

}

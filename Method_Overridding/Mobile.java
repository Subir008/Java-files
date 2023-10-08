package Method_Overridding;

class Landline{
	void phone() {
		System.out.println("Landline use for calling");
	}
}

class Cellphone extends Landline{
	void phone() {
		System.out.println("Cell phone is now use for calling");
	}
}

public class Mobile {

	public static void main(String[] args) {
		Cellphone c1 = new Cellphone();
		c1.phone();
	}

}

package Method_Overridding;

class Gpay{
	void name() {
		System.out.println("It is known as Google Pay");
	}
}

class Gpay_v1 extends Gpay{
	void name() {
		System.out.println("It is known as Gpay ");
	}
}

public class Payment {

	public static void main(String[] args) {
		Gpay_v1 g1 = new Gpay_v1();
		g1.name();

	}

}

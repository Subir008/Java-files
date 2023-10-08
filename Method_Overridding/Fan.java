package Method_Overridding;

class Control{
	void type() {
		System.out.println("Operate by Switch");
	}
}

class Control1 extends Control{
	void type() {
		super.type();
		System.out.println("Operate Remotely");
	}
}

public class Fan {

	public static void main(String[] args) {
		Control1 c1 = new Control1();
		c1.type();

	}

}

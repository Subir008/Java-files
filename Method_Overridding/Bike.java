package Method_Overridding;

class Old_ways{
	void gear() {
		System.out.println("Use Kick for Starting");
	}
}

class New_ways extends Old_ways{
	void gear() {
		super.gear();
		System.out.println("Use Switch for starting");
	}
}

public class Bike {

	public static void main(String[] args) {
		New_ways n2 = new New_ways();
		n2.gear();
	}

}

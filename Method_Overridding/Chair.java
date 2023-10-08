package Method_Overridding;

class Material{
	void type() {
		System.out.println("Use wood for making chairs");
	}
}

class Material1 extends Material{
	void type(){
		System.out.println("Use plastic, steel for making Chairs");
	}
}

public class Chair {

	public static void main(String[] args) {
		Material1 m1 = new Material1();
		m1.type();

	}

}
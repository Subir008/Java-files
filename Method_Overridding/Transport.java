package Method_Overridding;

class Farming{
	void use() {
		System.out.println("Use Bullock Cart");
	}
}

class Farming_new extends Farming{
	void use() {
		System.out.println("Use Van for transprting");
	}
}

public class Transport {

	public static void main(String[] args) {
		Farming_new f1 = new Farming_new();
		f1.use();

	}

}

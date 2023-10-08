package Pass_by_Reference;

class Optical_shop{
	void glasstype1() {
		System.out.println("Sunglass");
	}
	
	void glasstype2() {
		System.out.println("Power glass");
	}
}

public class Lenskart {

	public static void main(String[] args) {
		Optical_shop o = new Optical_shop();
		Public.buying(o);
		Public p= new Public();
		p.buying1(o);
		

	}
}

class Public{
	static void buying(Optical_shop o) {
		o.glasstype1();
	}
	
	void buying1(Optical_shop o) {
		o.glasstype2();
	}
}
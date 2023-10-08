package Method_Overridding;

class Old_tv{
	void type() {
		System.out.println("Black & White Tv");
	}
}

class New_tv extends Old_tv{
	void type() {
		System.out.println("Color LED TV");
	}
}

public class Tv {

	public static void main(String[] args) {
		New_tv n1 = new New_tv();
		n1.type();

	}

}

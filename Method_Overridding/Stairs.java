package Method_Overridding;

class Old{
	void way() {
		System.out.println("Use stairs made of bricks");
	}
}

class New extends Old{
	void way() {
		super.way();
		System.out.println("Use Lifts & Escalators");
	}
}

public class Stairs {

	public static void main(String[] args) {
		New n1 = new New();
		n1.way();

	}

}

package Method_Overloading;

class Spects{
	static void glass(int no) {
		System.out.println(no);
	}
	static void glass(String type) {
		System.out.println(type);
	}
	static void glass(int no , String type) {
		System.out.println(no +" " +type);
	}
	static void glass(String type, int no) {
		System.out.println(type +" " +no );
	}
}

public class Spectacle {

	public static void main(String[] args) {
		Spects.glass(500);
		Spects.glass("Sunglass");
		Spects.glass(500, "Sunglass");
		Spects.glass("Sunglass", 500);
	}

}

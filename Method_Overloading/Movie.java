package Method_Overloading;

class Movi{
	static void seen(int no) {
		System.out.println(no);
	}
	static void seen(String type) {
		System.out.println(type);
	}
	static void seen(int no , String type) {
		System.out.println(no +" " +type);
	}
	static void seen(String type, int no) {
		System.out.println(type +" " +no );
	}
}

public class Movie {

	public static void main(String[] args) {
		Movi.seen(500);
		Movi.seen("Action");
		Movi.seen(500, "Action");
		Movi.seen("Action", 500);
	}

}

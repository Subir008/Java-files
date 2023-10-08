package Method_Overloading;

class Movi1{
	void seen(int no) {
		System.out.println(no);
	}
	void seen(String type) {
		System.out.println(type);
	}
	void seen(int no , String type) {
		System.out.println(no +" " +type);
	}
	void seen(String type, int no) {
		System.out.println(type +" " +no );
	}
}
public class Movie1 {

	public static void main(String[] args) {
		Movi1 m1 = new Movi1();
		m1.seen(600);
		m1.seen("Comedy");
		m1.seen(600, "Comedy");
		m1.seen("Comedy", 600);
	}

}

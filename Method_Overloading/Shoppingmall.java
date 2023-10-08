package Method_Overloading;

class Shopping{
	static void mall(int no) {
		System.out.println(no);
	}
	static void mall(String type) {
		System.out.println(type);
	}
	static void mall(int no , String type) {
		System.out.println(no +" " +type);
	}
	static void mall(String type ,int no) {
		System.out.println(type +" " +no);
	}
}

public class Shoppingmall {

	public static void main(String[] args) {
		Shopping.mall(500);
		Shopping.mall("Dress");
		Shopping.mall(500, "Dress");
		Shopping.mall("Dress", 500);
	}

}

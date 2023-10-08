package Method_Overloading;

class Shopping1{
	 void mall(int no) {
		System.out.println(no);
	}
	void mall(String type) {
		System.out.println(type);
	}
	void mall(int no , String type) {
		System.out.println(no +" " +type);
	}
	void mall(String type ,int no) {
		System.out.println(type +" " +no);
	}
}

public class Shoppingmall1 {

	public static void main(String[] args) {
		Shopping1 s1 = new Shopping1();
		s1.mall(1000);
		s1.mall("Pant");
		s1.mall(1000, "Pant");
		s1.mall("Pant", 1000);
	}

}

package Method_Overloading;

class User3{
	static void mob(int no) {
		System.out.println(no);
	}
	static void mob(String text) {
		System.out.println(text);
	}
	static void mob(int no , String text ) {
		System.out.println(no +" " +text);
	}
	static void mob(String text , int no) {
		System.out.println(text +" "+ no);
	}
}

public class Mobile {

	public static void main(String[] args) {
		User3.mob(007);
		User3.mob("Tom");
		User3.mob(007, "Tom");
		User3.mob("Tom", 007);
	}

}

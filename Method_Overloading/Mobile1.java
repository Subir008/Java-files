package Method_Overloading;

class User4{
	void mob(int no) {
		System.out.println(no);
	}
	void mob(String text) {
		System.out.println(text);
	}
	void mob(int no,String text) {
		System.out.println(no +" " +text);
	}
	void mob(String text , int no) {
		System.out.println(text +" " +no);
	}
}

public class Mobile1 {

	public static void main(String[] args) {
		User4 u1=new User4();
		u1.mob(8);
		u1.mob("Tom");
		u1.mob(8, "Tom");
		u1.mob("Tom" ,8);

	}

}

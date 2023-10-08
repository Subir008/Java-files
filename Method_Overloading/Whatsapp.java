package Method_Overloading;

class User{
	static void send(int no) {
		System.out.println("Sending a no " +no);
	}
	static void send(String text) {
		System.out.println("Sending a text " +text);
	}
	static void send(int no , String text) {
		System.out.println("Sending a no & text " +no +text);
	}
	static void send(String text ,int no) {
		System.out.println("Sending a " +text+ " and "+ +no);
	}
}
public class Whatsapp {

	public static void main(String[] args) {
		User.send(10);
		User.send("Hello");
		User.send(10 ,"Hello");
		User.send("Hello" , 10);
	}

}

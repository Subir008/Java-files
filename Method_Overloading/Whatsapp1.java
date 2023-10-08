package Method_Overloading;

class User1{
 void send(int no) {
	 System.out.println("Sending a no " +no);
 }
 void send(String text) {
	 System.out.println("Sending a text " +text);
 }
 void send(int no , String text) {
	 System.out.println("Sending " +no +" and " +text);
 }
 void send(String text, int no) {
	 System.out.println("Sending " +text +" and " + +no);
 }
}

public class Whatsapp1 {

	public static void main(String[] args) {
		User1 u1 = new User1();
		u1.send(10);
		u1.send("Hi");
		u1.send(10, "HII");
		u1.send("Hii", 10);
	}

}

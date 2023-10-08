package Exception_Handling;

public class Sample3 {

	public static void main(String[] args) {
	System.out.println("Main start");
	try {
		String s1 = null;
		System.out.println(s1.toString());
	} catch (NullPointerException e) {
		System.out.println("Handled");
	}
	finally {
		System.out.println("Close the server");
	}
	System.out.println("Main Ends");
	}

}

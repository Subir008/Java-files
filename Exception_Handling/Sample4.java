package Exception_Handling;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			String s1 = null;
			System.out.println(s1.toString());
		}
		finally {
			System.out.println("Close the server");
		}
		System.out.println("Main End");
	}

}

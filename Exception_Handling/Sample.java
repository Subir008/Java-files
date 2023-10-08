package Exception_Handling;

public class Sample {

	public static void main(String[] args) {
		System.out.println("*** Main Start ***");
		try {
			int i = 10 / 0;
			System.out.println(i);
		}
		catch (ArithmeticException e) {
			System.out.println("Beta  input dekh ka dalo");
		}
		
		System.out.println("*** Main Ends ***");

	}

}

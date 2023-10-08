package Exception_Handling;

public class Sample2 {

	public static void main(String[] args) {
	System.out.println("Main Start");
	try {
		int i = 10 / 1;
		try {
			String s1 = "Helo";
			System.out.println(s1.charAt(i));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
	}catch (ArithmeticException e) {
		System.out.println("Caught");
	}
	System.out.println("Main End");
	}

}

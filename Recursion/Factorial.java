package Recursion;

public class Factorial {
	
	static int fact = 1;
	static int facto(int no)
	{
		if (no >= 1)
		{
			fact = fact *no;
			no --;
			facto(no);
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(facto(5));

	}

}

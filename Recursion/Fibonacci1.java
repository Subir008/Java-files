package Recursion;

public class Fibonacci1 {

	static int f1 =0;
	static int f2 = 1;
	static void fibbo(int no)
	{
		if(no >= 1)
		{
			f1 = f1+f2;
			f2 = f1 - f2;
			System.out.print(" " + f1);
			no--;
			fibbo(no);
		}
	}
	public static void main(String[] args) {
		System.out.print(f1);
		fibbo(6);
	}

}

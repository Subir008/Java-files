package Recursion;

public class Fibonacci {

	static int f1 = 0;
	static int f2 = 1;
	static void fibo(int no)
	{
		if (no >=1)
		{
			int f3 = f1 + f2;
			System.out.print(" "+f3);
			f1 = f2;
			f2 = f3;
			no--;
			fibo(no);
		}
	}
	public static void main(String[] args) {
		System.out.print(f1 + " " + f2);
		fibo(5);

	}

}

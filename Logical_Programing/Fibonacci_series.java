
package Logical_Programing;

public class Fibonacci_series {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print(" "+a);
		System.out.print(" "+b);
		for (int i = 0; i <= 10; i++)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.print(" " +c);
		}
	}
}

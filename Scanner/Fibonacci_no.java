package Scanner;

import java.util.Scanner;

public class Fibonacci_no {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range no ");
		int x = sc.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.print(" "+a);
		System.out.print(" "+b);
		int c;
		
		for (int i = 0; i <= x ; i++)
		{
			c = a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}

}

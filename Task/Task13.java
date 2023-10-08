// Factorial,Fibonacci,Odd or Even ,Sum of digit, Sum of square of digit, Sum of cube of digit, 
// Swapping with & without 3rd variable.

package Task;

import java.util.Scanner;

public class Task13 {
	
	static int Factorial(int x)
	{
		int fact = 1;
		for(int i = 1 ; i <= x ; i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	
	static void Fibonacci(int x)
	{
		int a = 0;
		int b = 1;
		System.out.print("Fibonacci ");
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
		System.out.println();
	}
	
	static void Prime(int x)
	{
		int flag = 0;
		for (int i = 2; i <= x/2; i++)
		{
			if (x % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Odd no "+x);
		}
		else {
			System.out.println("Even no " +x);
		}
	}
	
	static int Sumdgt(int x)
	{
		int sum = 0;
		while (x != 0)
		{
			int rem = x % 10;
			sum = sum + rem;
			x = x / 10;
		}
		return sum;
	}
	
	static int Sumsq(int x)
	{
		int sum = 0;
		while (x != 0)
		{
			int rem = x % 10;
			sum = sum + rem*rem;
			x = x / 10;
		}
		return sum;
	}
	
	static int Sumcube(int x)
	{
		int sum = 0;
		while (x != 0)
		{
			int rem = x % 10;
			sum = sum + rem*rem*rem;
			x = x / 10;
		}
		return sum;
	}
	
	static void Swap(int x, int y)
	{
		int z;
		z = x;
		x = y;
		y = z;
		
		System.out.println("Swapping "+x);
		System.out.println("Swapping "+y);
	}
	
	static void Swap2(int x, int y)
	{
		x = x+y;
		y = x- y;
		x = x-y;
		System.out.println("Swap without 3rd variable "+x);
		System.out.println("Swap without 3rd variable "+y);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd no ");
		int y = sc.nextInt();
		
		System.out.println("Factorial "+ Factorial(x));
		Fibonacci(x);
		Prime(x);
		System.out.println("Sum of digit "+Sumdgt(x));
		System.out.println("Sum of square of digit " +Sumsq(x));
		System.out.println("Sum of cube of digit "+ Sumcube(x));
		Swap(x,y);
		Swap2(x,y);
		
		
	}
}

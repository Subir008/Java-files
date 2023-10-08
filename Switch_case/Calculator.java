package Switch_case;

import java.util.Scanner;

public class Calculator {

	static void add(int a, int b)
	{
		int z = a+b;
		System.out.println("Addition is "+z);
	}
	static void sub(int a, int b)
	{
		int x = a-b;
		System.out.println("Subtraction is "+x);
	}
	static void mul(int a, int b)
	{
		int y = a*b;
		System.out.println("Multiplication is "+y);
	}
	static void div(int a, int b)
	{
		int w = a / b;
		System.out.println("Division is "+w);
		
	}
	public static void main(String[] args) {
		System.out.println(" **** CALCULATOR ****");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1. Addition");
		System.out.println(" 2. Subtraction");
		System.out.println(" 3. Multiplication");
		System.out.println(" 4. Division");
		
		System.out.println("Enter 1st Number :");
		int x = sc.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		int y = sc.nextInt();
		
		System.out.println("Enter your choice :");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			add(x,y);
			break;
		case 2:
			sub(x,y);
			break;
		case 3:
			mul(x,y);
			break;
		case 4:
			div(x,y);
			break;

		default: System.out.println("Invalid Choices");
			break;
		}
	}

}

package Switch_case;

import java.util.Scanner;

public class Number_logical_program {
	
	static void facto(int num)
	{
		int fact = 1;
		for(int i= 1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
	static void fibo(int num)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(" "+ a);
		System.out.print(" "+b);
		for (int i = 0; i <num; i++)
		{
			c= a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
		
		
	}
	static void prime(int num)
	{
		int flag = 0;
		for (int i = 2; i < num/2 ; i++)
		{
			if (num % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not prime");
		}
	}
	static void reverse(int num)
	{
		int rev = 1;
		while (num != 0)
		{
			int rem = num % 10;
			rev = rev*10 + rem;
			num = num /10;
		}
		System.out.println(rev);
	}
	static void pallindrome(int num)
	{
		int copy = num ;
		int rev = 0;
		if (num != 0)
		{
			int rem = num % 10 ;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (copy == rev)
		{
			System.out.println("Pallindrome number" +copy);
		}
		else {
			System.out.println("Not a pallindrome number " +copy);
		}
		
	}
	static void sod(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}
	static void sos(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int rem = num % 10;
			sum = sum + rem*rem;
			num = num /10;
		}
		System.out.println(sum);
	}
	static void soc(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int rem = num % 10;
			sum = sum + rem*rem*rem;
			num = num /10;
		}
		System.out.println(sum);
	}
	static void arm(int num)
	{
		int copy = num;
		int sum = 0;
		while (num != 0)
		{
			int rem = num % 10;
			sum = sum + rem* rem*rem;
			num = num / 10;
		}
		if(copy == sum ) {
			System.out.println("Armstrong number" +copy);
		}
		else {
			System.out.println("Not a Armstrong number" +copy);
		}
		
	}
	static void strong(int num)
	{
		int copy = num ;
		int sum = 0;
		while (num != 0)
		{
			int rem = num % 10;
			int fact = 1;
			for (int i = 1; i <= rem ; i++)
			{
				fact = fact * i;
			}
			sum = sum + fact;
			num = num /10 ;
		}
		if (copy == sum)
		{
			System.out.println("Strong number "+ copy);
		}
		else {
			System.out.println("Not a strong number " + copy);
		}
	}
	static void swap(int x, int y)
	{
		int z = 0;
		 z = x;
		 x = y;
		 y = z;
		System.out.println("1st number " +x);
		System.out.println("2nd number " +y);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** LOGICAL PROGRAM ***");
		
		System.out.println("1. Factorial");
		System.out.println("2. Fibonacci series");
		System.out.println("3. Prime number ");
		System.out.println("4. Reverse number ");
		System.out.println("5. Reverse pallindrome");
		System.out.println("6. Sum of digit ");
		System.out.println("7. Sum of square ");
		System.out.println("8. Sum of cube ");
		System.out.println("9. Armstrong number ");
		System.out.println("10. Strong number ");
		System.out.println("11. Swapping number ");
		
		System.out.println();
		System.out.println("Enter your choice : ");
		int input = sc.nextInt();
		
		System.out.println("Enter 1st number :");
		int x = sc.nextInt();
		int y =0;
		
		if (input == 11)
		{
			System.out.println("Enter 2nd number :");
			y = sc.nextInt();
		}
		
		
		switch (input) {
		case 1:
			facto(x);
			break;
		case 2:
			fibo(x);
			break;
		case 3:
			prime(x);
			break;
		case 4:
			reverse(x);
			break;
		case 5:
			pallindrome(x);
			break;
		case 6:
			sod(x);
			break;
		case 7:
			sos(x);
			break;
		case 8:
			soc(x);
			break;
		case 9:
			arm(x);
			break;
		case 10:
			strong(x);
			break;
		case 11:
			swap(x,y);
			break;

		default: System.out.println("Invalid choice");
			break;
		}

	}

}

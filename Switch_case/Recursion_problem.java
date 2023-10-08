package Switch_case;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_problem {
	
		static int fact = 1;
		static int fact(int y)
		{
			if (y > 0)
			{
				fact = fact * y;
				y--;
				fact(y);
			}
			return fact;
		}
		
		static void fibbo(int n1, int n2, int y)
		{
			if (y > 0)
			{
				int n3 = n1+ n2;
				System.out.print(" " +n3);
				n1 = n2 ;
				n2 = n3;
				y--;
				fibbo(n1,n2,y);
			}
		}
		
		static int i = 2;
		static void prime(int y )
		{
			if (i <= y )
			{
				boolean flag = true;
				if (y % i == 0)
				{
					flag = false;
				}
				if (flag == true)
				{
					System.out.println("Prime number");
				}
				else 
				{
					System.out.println("Not prime");
				}
				prime(i++);
			}
		}
		
		static int sum = 0;
		static void sod(int y)
		{
			if (y > 0)
			{
				int rem = y % 10;
				sum = sum + rem;
				y = y /10;
				sod(y);	
			}
		}
		
//		static int sum1 = 0;
		static void sos(int y)
		{
			if (y > 0)
			{
				int rem = y % 10;
				sum = sum + rem*rem;
				y = y / 10;
				sos(y);
			}
		}
		
		//static int sum2 = 0;
		static void soc(int y)
		{
			if (y > 0)
			{
				int rem = y % 10;
				sum = sum + rem*rem*rem;
				y = y / 10;
				soc(y);
			}
		}
		
//		static int sum = 0;
		static void arms(int y)
		{
			if (y > 0)
			{
				int rem = y % 10;
				sum = sum + rem*rem*rem;
				y = y / 10;
				arms(y);
			}
		}
		
		static int rev = 0;
		static void reverse(int y)
		{
			if (y > 0)
			{
				int rem = y % 10;
				rev = rev*10 + rem;
				y = y / 10;
				reverse(y);
			}
			
		}
		
		static int rev1 = 0;
		static void noPalin(int y)
		{
			if (y > 0)
			{
				int rem = y % 10;
				rev1 = rev1*10 + rem;
				y = y / 10;
				noPalin(y);
			}
		}
		
		static String  s = "";
		static void stringRev(String y, int length)
		{
			if (length >=0)
			{
				s = s + y.charAt(length);
				stringRev(y,length-1);
			}
		}
		
		static void stringPallin(String y , int length)
		{
			if (length >=0)
			{
				s = s + y.charAt(length);
				stringRev(y,length-1);
			}
		}
		
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			ArrayList a = new ArrayList();
			System.out.println("*** RECURSION PROBLEMS ***");
			System.out.println();
			System.out.println("1. Factorial ");
			System.out.println("2. Fibbonaci number");
			System.out.println("3. Prime number");
			System.out.println("4. Sum of digit");
			System.out.println("5. Sum of square");
			System.out.println("6. Sum of cube");
			System.out.println("7. Armstrong number");
			System.out.println("8. Reverse a number");
			System.out.println("9. Number pallindrome");
			System.out.println("10. String reverse");
			System.out.println("11. String pallindrome");
			
			System.out.println();
			System.out.println("Enter choice");
			int input = sc.nextInt();
			
			System.out.println();
			String x = "";
			int y = 0;
			
			if (input < 10)
			{
				System.out.println("Enter number");
				 y = sc.nextInt();
			}
			else {
				System.out.println("Enter string");
				 x = sc.next();
			}
			
			switch (input) {
			case 1:
			//	a.add(fact(y));
				System.out.println( fact(y));
				break;
			case 2:
				int n1 = 0;
				int n2 = 1;
				System.out.print(n1 +" " +n2);
				fibbo(n1, n2, y);
				break;
			case 3:
				prime(y);
				break;
			case 4:
				 sod(y);
				 System.out.println(sum);
				break;
			case 5:
				sos(y);
				System.out.println(sum);
				break;
			case 6:
				soc(y);
				System.out.println(sum);
				break;
			case 7:
				int num = y;
				arms(y);
				if (num == sum)
				{
					System.out.println("Armstrong number");
				}
				else {
					System.out.println("Not Armstrong");
				}
				break;
			case 8:
				reverse(y);
				System.out.println(rev);
				break;
			case 9:
				int copy = y;
				noPalin(y);
				if(copy == rev1)
				{
					System.out.println("Pallindrome number");
				}
				else
				{
					System.out.println("Not Pallindrome");
				}
				break;
			case 10:
				int length = x.length()-1;
				stringRev(x,length);
				System.out.println(s);
				break;
			case 11:
				String copy1 = x;
				int length1 = x.length()-1;
				stringPallin(x, length1);
				if (s.equals(copy1))
				{
					System.out.println("String pallindrome");
				}
				else {
					System.out.println("Not a pallindrome");
				}
				break;

			default: System.out.println("Out of option");
				break;
			}

		}

	}



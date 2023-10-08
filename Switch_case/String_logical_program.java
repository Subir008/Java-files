package Switch_case;

import java.util.Scanner;

public class String_logical_program {
	
	static void vowel(String x)
	{
		
		String s1 = "";
		for (int i = 0; i < x.length(); i++)
		{
			if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' ||
					x.charAt(i) == 'o' || x.charAt(i) == 'u'  )
			{
				s1 = s1 + x.charAt(i);
			}
		}
		System.out.println(s1);
	}
	
	static void consonent(String x)
	{
		String s1 = "";
		for (int i = 0; i < x.length(); i++)
		{
			if (x.charAt(i) != 'a' && x.charAt(i) != 'e' && x.charAt(i) != 'i' &&
					x.charAt(i) != 'o' && x.charAt(i) != 'u'  )
			{
				s1 = s1 + x.charAt(i);
			}
		}
		System.out.println(s1);
	}
	
	static void fetchdupli(String x)
	{
		for (int i = 0; i < x.length(); i++)
		{
			int count = 0;
			for (int j = 0; j < x.length(); j++) 
			{
				if (x.charAt(i) == x.charAt(j))
				{
					count ++;
				}
			}
			if (count > 1)
			{
				System.out.print(x.charAt(i));
			}
		}
	}
	
	static void fetchuni(String x)
	{
		for (int i = 0; i < x.length(); i++) 
		{
			int count = 0;
			for (int j = 0; j < x.length(); j++)
			{
				if(x.charAt(i) == x.charAt(j))
				{
					count ++;
				}
			}
			if (count == 1)
			{
				System.out.print(x.charAt(i));
			}
		}
	}
	
	static void countdupli(String x)
	{
		for (int i = 0; i < x.length(); i++)
		{
			int count = 0;
			for (int j = 0; j < x.length(); j++) 
			{
				if(x.charAt(i) == x.charAt(j))
				{
					count ++;
				}
			}
			if (count >1)
			{
				System.out.println(x.charAt(i) + " " + count);
			}
		}
	}
	
	static void countuni(String x)
	{
		for (int i = 0; i < x.length(); i++)
		{
			int count = 0;
			for (int j = 0; j < x.length(); j++) 
			{
				if(x.charAt(i) == x.charAt(j))
				{
					count ++;
				}
			}
			if (count == 1)
			{
				System.out.println(x.charAt(i) + " " + count);
			}
		}
	}
	
	static void reverse(String x)
	{
		String s1 = "";
		for (int i = x.length()-1; i >= 0; i--)
		{
			s1 = s1 + x.charAt(i);
		}
		System.out.println(s1);
	}
	
	static void palindrome(String x)
	{
		String s1 = x;
		String s2 = "";
		for(int i = x.length()-1 ; i >= 0 ; i--)
		{
			s2 = s2 + x.charAt(i);
		}
		if (s1.equals(s2))
		{
			System.out.println("Pallindrome string");
		}
		else {
			System.out.println("Not a pallindrome string");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** STRING PROGRAMS ***");
		System.out.println();
		System.out.println("1. Fetch the vowels");
		System.out.println("2. Fetch the consonent");
		System.out.println("3. Fetch the duplicate characters");
		System.out.println("4. Fetch the unique characters");
		System.out.println("5. Count the duplicate characters");
		System.out.println("6. Count the unique characters");
		System.out.println("7. Reverse a String");
		System.out.println("8. String Pallindrome");
		
		System.out.println();
		
		System.out.println("Enter the String");
		String x = sc.next();
		
		System.out.println();
		System.out.println("Enter your choice of operation ");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			vowel(x);
			break;
		case 2:
			consonent(x);
			break;
		case 3:
			fetchdupli(x);
			break;
		case 4:
			fetchuni(x);
			break;
		case 5:
			countdupli(x);
			break;
		case 6:
			countuni(x);
			break;
		case 7:
			reverse(x);
			break;
		case 8:
			palindrome(x);
			break;

		default: System.out.println("No option");
			break;
		}
	}

}

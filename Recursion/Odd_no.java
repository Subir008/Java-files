package Recursion;

public class Odd_no {
	
	static void odd(int no)
	{
		if (no <= 10)
		{
			if(no % 2 != 0)
			{
				System.out.print(" " +no);
			}
			no++;
			odd(no);
		}
	}
	static void revodd(int num)
	{
		if (num >= 1)
		{
			if (num % 2 != 0)
			{
				System.out.println("Reverse" +" "+ num);
			}
			num --;
			revodd(num);
		}
	}

	public static void main(String[] args) {
		
		odd(1);
		System.out.println();
		revodd(10);

	}

}

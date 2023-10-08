package Recursion;

public class Sum_even {
	
	static int sum = 0;
	static int even_sum(int no)
	{
		if (no >= 0)
		{
			if (no % 2 ==0)
			{
				sum = sum + no ;
			}
			no --;
			even_sum(no);
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		System.out.println(even_sum(10));

	}

}

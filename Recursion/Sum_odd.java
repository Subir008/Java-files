package Recursion;

public class Sum_odd {
		
	static int sum = 0;
	static int odd_sum(int no)
	{
		if (no >= 0)
		{
			if (no % 2 != 0)
			{
				sum = sum + no;
			}
			no --;
			odd_sum(no);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println( odd_sum(10));

	}

}

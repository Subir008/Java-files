package Recursion;

public class Prime {
	
	static boolean flag = true;
	static int i = 2;
	static void prime(int no)
	{
		
		if ( i <= no)
		{
			if(no % i == 0)
			{
				flag = false;
			}
			if (flag == true) {
				System.out.println("prime " +no);
			}
			else {
				System.out.println("not prime "+ no);
			}
			prime(i++);
		}
		
	}

	public static void main(String[] args) {
		
		prime(53);

	}

}

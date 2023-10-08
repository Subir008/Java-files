// Prime number from the fibonacci series


package Logical_Programing;

public class Prime_fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b= 1;
		int c ;
		
//		System.out.println(" " +a);
//		System.out.println(" " +b);
		
		for (int i = 2; i < 10; i++)
		{
			c = a+b;
			a = b ;
			b = c;
//			System.out.println(" "+c);
			
			int flag = 0;
			for (int j = 2 ; j <= c/2 ; j++)
			{
				if (c % j == 0)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.println("prime no : " + c);
			}
		}

	}

}

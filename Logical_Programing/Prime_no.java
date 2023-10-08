package Logical_Programing;

public class Prime_no {

	public static void main(String[] args) {
		int no = 20;
		int flag = 0;
		
		for (int i = 2 ; i <= no/2 ; i++)
		{
			while (no % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.println("Prime number");
		}else
		{
			System.out.println("Not prime");
		}

	}

}

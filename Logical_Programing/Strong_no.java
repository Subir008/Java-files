package Logical_Programing;

public class Strong_no {

	public static void main(String[] args) {
		int no = 145;
		int copy = no ;
		int sum = 0;
		
		while (no != 0)
		{
			int rem = no % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++)
			{
				fact = fact * i;
			}
			sum = sum + fact ;
			no = no / 10 ;
		}
		if (copy == sum)
		{
			System.out.println("Strong number " + copy);
		}
		else {
			System.out.println("Not a Strong number " +copy);
		}

	}

}

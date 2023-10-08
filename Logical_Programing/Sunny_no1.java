package Logical_Programing;

public class Sunny_no1 {

	static void sq(int x)
	{
		int copy = x;
		int no = 1;
		boolean flag = false;
		
		for (int i = 1 ; i <= x/2 ; i++)
		{
			no = i * i;
			if (copy == no)
			{
				System.out.println("Sunny number");
				flag = true;
				break;
			}
		}
		if (flag == false)
		{
			System.out.println("Not a sunny number");
		}
	}
	
	public static void main(String[] args) {
		int no = 120;
		
		int n = no + 1;
		
		sq(n);
		
	}

}

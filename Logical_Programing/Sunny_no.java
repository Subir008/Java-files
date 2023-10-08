// Add 1 with the number
// If the no is equal to the perfect square
// It is SUNNY NUMBER

package Logical_Programing;

public class Sunny_no {

	public static void main(String[] args) {
		int no = 168;
		int flag = 0;
		
		int n = no + 1;
		int sq = 1;
		
		for (int i = 1 ; i <= n/2 ; i++)
		{
			sq = i*i;
			if (sq == n)
			{
				flag = 1;
				break;
			}
		}
		
		if (flag == 1)
		{
			System.out.println("Sunny number");
		}
		else {
			System.out.println("Not a sunny number");
		}

	}

}

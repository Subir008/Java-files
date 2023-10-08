// Fetch sum of sq of digit 
// If it is equals to 1 
// It is a Happy number.

package Logical_Programing;

public class Happy_no {
	
	static int sq(int  x)
	{
		int sum = 0;
		while (x != 0)
		{
			int rem = x % 10;
			sum = sum + rem*rem;
			x = x / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int no = 15;
		
		while (no != 1) {
			no = sq(no);
		}
		if(no == 1)
		{
			System.out.println("Happy number");
		}
		else {
			System.out.println("Not a happy number");
		}
		
	}

}

//Do square of the number
// Then fetch it's sum of digit
// If the number equal to the sum of digit
// It is a NEON NUMBER;

package Logical_Programing;

public class Neon_no {

	public static void main(String[] args) {
		int no = 9;
		int copy = no;
		int sq = 0;
		int sum = 0;
		
		sq = no * no ;
		
		while (sq != 0)
		{
			int rem = sq % 10;
			sum = sum + rem;
			sq = sq / 10;
		}
		if (sum ==  copy)
		{
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not a neon number");
		}
		

	}

}

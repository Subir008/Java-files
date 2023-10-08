// Fetch the sum of digit
// Reverse the number
// Multiply the reverse & sum of digit
// If multiply equals to the number
// It is a MAGIC NUMBER

package Logical_Programing;

public class Magic_no {

	public static void main(String[] args) {
		int no = 1729;
		int copy = no;
		int sum = 0;
		int rev = 0;
		int mult = 1;
		
		while (no != 0)
		{
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		int copy1 = sum;
		
		while (sum != 0)
		{
			int rem = sum % 10;
			rev = rev*10 + rem;
			sum = sum / 10;
		}
		
		mult = copy1 * rev;
		
		if (mult == copy)
		{
			System.out.println("Magic number");
		}
		else {
			System.out.println("Not a magic number");
		}
	}

}

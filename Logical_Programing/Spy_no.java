//Find the sum of digit & product of digit
// if both of them are equal then it is a SPY NUMBER

package Logical_Programing;

public class Spy_no {

	public static void main(String[] args) {
		int no = 22; // 123
		int copy = no ;
		int sum = 0;
		int  product = 1;
		
		while (no != 0)
		{
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		
		while (copy != 0)
		{
			int rem = copy % 10;
			product = product * rem;
			copy = copy / 10;
		}
		
		if (sum == product)
		{
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not a spy number");
		}

	}

}

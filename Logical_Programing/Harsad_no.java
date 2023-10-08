// Fetch the sum of digit
// then divide the number from sum of digit if it is equal to zero 
// It is a HARSAD NUMBER

package Logical_Programing;

public class Harsad_no {

	public static void main(String[] args) {
		int no = 156;
		int copy = no;
		int div = 1;
		int sum = 0;
		
		while (no != 0)
		{
			int rem = no % 10;
			sum = sum + rem ;
			no = no / 10 ;
		}
		
		div = copy % sum ;
		
		if (div == 0)
		{
			System.out.println("Harsad Number");
		}
		else {
			System.out.println("Not a Harsad number");
		}
		

	}

}

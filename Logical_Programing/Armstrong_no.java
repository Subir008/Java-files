package Logical_Programing;

class Arm{
	int arms(int no) {
		int m = no;
		int rev = 0;
		while (no != 0) {
			int rem = no % 10;
			rev = rev + rem*rem*rem;
			no = no/ 10;
		}
		
		if (m == rev) {
			return 1 ;
		} else {
			return 0;
		}
	}
}

public class Armstrong_no {

	public static void main(String[] args) {
		Arm a = new Arm();
		int x = a.arms(153);
		if (x == 1) {
			System.out.println("Armstrong no ");
		} else {
			System.out.println("Not a Armstrong no");
		}

	}

}

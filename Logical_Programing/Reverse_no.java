package Logical_Programing;

class Rever{
	int rev(int no) {
		int revers = 0;
		while(no != 0) {
			int rem = no % 10;
			revers = (revers * 10) + rem ;
			no = no / 10;
		}
		return revers;
		
	}
}

public class Reverse_no {

	public static void main(String[] args) {
		Rever r = new Rever();
		int a = r.rev(456);
		System.out.println(a);

	}

}

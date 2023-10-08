package Logical_Programing;

class Square{
	int sq(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem*rem ;
			no = no / 10;
		}
		return sum;	
	}	
}


public class Sum_of_sq {

	public static void main(String[] args) {
		Square s = new Square();
		int a =s.sq(456);
		System.out.println(a);
	
		
	}

}

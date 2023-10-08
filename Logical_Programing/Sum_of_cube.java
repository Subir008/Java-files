package Logical_Programing;

class Cube{
	int cub(int no) {
		int sum = 0;
		
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem * rem * rem ;
			no = no / 10;
		}
		return sum;
	}
}


public class Sum_of_cube {

	public static void main(String[] args) {
		Cube c = new Cube();
		int a = c.cub(456);
		System.out.println(a);
	}

}

package Logical_Programing;

class Facto{
	int fact(int no) {
		int factori = 1;
		for (int i = 1; i <= no; i++) {
			factori = factori * i;
		}
		return factori ;
	}
}

public class Factorial {

	public static void main(String[] args) {
		Facto f = new Facto ();
		int no = f.fact(5);
		System.out.println(no);

	}

}

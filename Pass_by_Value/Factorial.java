package Pass_by_Value;

class Facto{
	void fact(int no) {
		int num = 1;
		for (int i = 1; i <= no; i++) {
		num	= num*i;
		}
		System.out.println(num);
	}
}

public class Factorial {

	public static void main(String[] args) {
		Facto f1 = new Facto();
		f1.fact(5);

	}

}

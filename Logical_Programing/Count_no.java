package Logical_Programing;

class Counts{
	
	int num(long no) {
		int count = 0;
		while (no != 0) {
			long rem = no % 10;
			if (rem == 2) {
				count ++;
			}
			no = no / 10;
		}
		return count;
	}
}

public class Count_no {

	public static void main(String[] args) {
		Counts c = new Counts();
		long x = c.num(12121212121l);
		System.out.println(x);

	}

}

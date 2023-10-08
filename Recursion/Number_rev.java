package Recursion;

public class Number_rev {

	static void rangerev(int no)
	{
		if (no >= 1)
		{
			System.out.println(no);
			no--;
			rangerev(no);
		}
	}
	public static void main(String[] args) {
		rangerev(10);

	}

}

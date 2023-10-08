package Recursion;

public class Number {

	static void range(int no)
	{
		if(no <= 10)
		{
			System.out.println(no);
			no ++;
			range(no);
		}
	}
	public static void main(String[] args) {
		range(1);

	}

}

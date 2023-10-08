package Exception_Handling;

import java.util.Scanner;

public class Buy {

	static void buying() throws Buying
	{
		Scanner sc = new Scanner(System.in);
		String s1 = "alcohol";
		System.out.println("Enter item to add to your cart");
		String s2 = sc.next();
		String s3 = s2.toLowerCase();
		if (s1.equals(s3))
		{
			throw new Buying("You can't add this you are underage");
		}else {
			System.out.println("Added to your cart");
		}
	}
	public static void main(String[] args) {
		try {
			buying();
		}catch(Buying b)
		{
			System.out.println(b.getMsg());
		}
	}

}

class Buying extends Exception
{
	private String msg;
	Buying(String msg)
	{
		this.msg = msg;
	}
	public String getMsg()
	{
		return msg;
	}
}

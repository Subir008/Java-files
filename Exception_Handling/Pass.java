package Exception_Handling;

import java.util.Scanner;

public class Pass {
	
	static void pass() throws Password
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter old password");
		String s1 = sc.next();
		
		if (s1.equals("password"))
		{
			System.out.println("You can now add new password");
		}else {
			throw new Password("Password wrong");
		}
	}

	public static void main(String[] args) {
		try {
			pass();
		}
		catch(Password p) {
			System.out.println(p.getMsg());
		}

	}
}

class Password extends Exception
{
	private String msg;
	Password(String msg)
	{
		this.msg = msg;
	}
	public String getMsg()
	{
		return msg;
	}
}

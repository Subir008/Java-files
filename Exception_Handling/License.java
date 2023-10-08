package Exception_Handling;

import java.util.Scanner;

public class License {
	
	static void check() throws  LicenseException
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age >= 18)
		{
			System.out.println("You can apply for license");
		}else {
			throw new LicenseException("Apply after 18");
		}
		
	}

	public static void main(String[] args) {
		try {
			check();
		}catch(LicenseException l)
		{
			System.out.println(l.getMsg());
		}
	}
}

class LicenseException extends Exception{
	private String msg;
	LicenseException (String msg)
	{
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}

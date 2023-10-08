package Exception_Handling;

import java.util.Scanner;

public class Oyo_multi {

	static void check() throws OyoException1 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age >=18 && age <=59) {
			System.out.println("Welcome to heaven");
		}
		else if(age >= 60 )
		{
			throw new OyoException1("Bari bhago...");
		}else {
			throw new OyoException1("Bare hoke bappas ana....");
		}
	}
	
	public static void main(String[] args) {
		try {
			check();
		}
		catch(OyoException1 e) {
			System.out.println(e.getmsg());
		}
	}

}

class OyoException1 extends Exception{
	private String msg;
	OyoException1(String msg){
		this.msg = msg;
	}
	public String getmsg() {
		return msg;
	}
}

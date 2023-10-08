package Exception_Handling;

import java.util.Scanner;

public class Bank {

	static void check1() throws BankException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("You can open the account");
		}
		else {
			throw new BankException("You are underage you can't open account now");
		}
	}
	public static void main(String[] args) {
		
		try {
			check1();
		}catch (BankException b){
			System.out.println( b.getAge());
		}
	}
}

class BankException extends Exception{
	private String msg;
	BankException(String msg)
	{
		this.msg = msg;
	}
	public String getAge() {
		return msg;
	}
}

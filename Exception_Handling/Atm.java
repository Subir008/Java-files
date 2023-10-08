package Exception_Handling;

import java.util.Scanner;

public class Atm {

	
	static void withdraw() throws WithdrawException
	{
		int cash_available = 500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select cash want 100,200 or 500");
		int cash = sc.nextInt();
		if (cash_available == cash)
		{
			System.out.println("Enter withdrawl amount");
		}
		else {
			throw new WithdrawException("Cash not available");
		}
	}
	
	public static void main(String[] args) {
		try {
			withdraw();
		}catch (WithdrawException w){
			System.out.println(w.getMsg());
		}
	}
}

class WithdrawException extends Exception
{
	private String msg;
	WithdrawException(String msg) {
		this.msg = msg ;
	}
	public String getMsg()
	{
		return msg;
	}
}

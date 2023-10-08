package Encapsulation;

class Icici_bank{
	private int pin = 1234;
	
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin = pin;
	}
}

public class Icici_bank_user {

	public static void main(String[] args) {
		Icici_bank i1 = new Icici_bank();
		System.out.println("Old pin "+i1.getPin());
		i1.setPin(9876);
		System.out.println("New pin "+i1.getPin());
	}

}

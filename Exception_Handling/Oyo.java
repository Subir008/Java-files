package Exception_Handling;

public class Oyo {
	
	static void check() throws OyoException
	{
		int age = 15;
		if (age >= 18)
		{
			System.out.println("Welcome to Heaven .....");
		}
		else {
			throw new OyoException ("Bade hoke ana..");
		}
	}

	public static void main(String[] args) {
		
		try {
			check();
		}catch(OyoException e) {
			e.getmsg();
		}
		

	}

}

class OyoException extends Exception{
	private String msg;
	OyoException(String msg)
	{
		this.msg = msg;
	}
	public String getmsg() {
		return msg;
	}
	
}
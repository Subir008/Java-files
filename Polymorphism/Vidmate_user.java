package Polymorphism;

class Vidmate{
	void apps()
	{
		System.out.println("App list");
	}
}

class Youtube extends Vidmate{
	void apps ()
	{
		System.out.println("Youtube opened.");
	}
}

class Instagram extends Vidmate{
	void apps()
	{
		System.out.println("Instagram opened.");
	}
}

class Facebook extends Vidmate{
	void apps()
	{
		System.out.println("Facebook opened.");
	}
}

class Touch{
	static void open(Vidmate v1 )
	{
		v1.apps();
	}
}

public class Vidmate_user {

	public static void main(String[] args) {
		Youtube y1 = new Youtube();
		Instagram i1 = new Instagram();
		Facebook f1 = new Facebook();
		
		Touch.open(f1);
		Touch.open(i1);
		Touch.open(y1);
	}

}

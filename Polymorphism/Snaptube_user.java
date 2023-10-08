package Polymorphism;

class Snaptube{
	void apps()
	{
		System.out.println("App list");
	}
}

class Youtube1 extends Snaptube{
	void apps ()
	{
		System.out.println("Youtube opened.");
	}
}

class Instagram1 extends Snaptube{
	void apps()
	{
		System.out.println("Instagram opened.");
	}
}

class Facebook1 extends Snaptube{
	void apps()
	{
		System.out.println("Facebook opened.");
	}
}

class Touch1{
	static void open(Snaptube s1 )
	{
		s1.apps();
	}
}

public class Snaptube_user {

	public static void main(String[] args) {
		Youtube1 y1 = new Youtube1();
		Instagram1 i1 = new Instagram1();
		Facebook1 f1 = new Facebook1();
		
		Touch1.open(f1);
		Touch1.open(i1);
		Touch1.open(y1);
	}

}

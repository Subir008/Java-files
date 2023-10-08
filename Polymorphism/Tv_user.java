package Polymorphism;

class Android_tv{
	void apps()
	{
		System.out.println("App list");
	}
}

class Netflix extends Android_tv{
	void apps()
	{
		System.out.println("Netflix opened");
	}
}

class Voot extends Android_tv{
	void apps ()
	{
		System.out.println("Voot opened");
	}
}

class Hotstar extends Android_tv{
	void apps () 
	{
		System.out.println("Hotstar opened");
	}
}

class Remote{
	static void switchs(Android_tv a1)
	{
		a1.apps();
	}
}

public class Tv_user {

	public static void main(String[] args) {
		Netflix n1 = new Netflix();
		Voot v1 = new Voot();
		Hotstar h1 = new Hotstar();
		
		Remote.switchs(h1);
		Remote.switchs(v1);
		Remote.switchs(n1);
	}

}

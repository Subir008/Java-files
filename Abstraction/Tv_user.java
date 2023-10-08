package Abstraction;

interface Tv{
	void uses();
}

class Hotstar implements Tv{
	public void uses ()
	{
		System.out.println("Hotstar opened");
	}
}

class Voot implements Tv{
	public void uses ()
	{
		System.out.println("Voot opened");
	}
}

class Remote {
	static void switches(Tv t1 ) {
	t1.uses();
	}
}

public class Tv_user {

	public static void main(String[] args) {
		Hotstar h1 = new Hotstar();
		Voot v1 = new Voot();
		
		Remote.switches(v1);
		Remote.switches(h1);

	}

}

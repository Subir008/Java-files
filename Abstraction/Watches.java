package Abstraction;


interface Watch{
	void apps();
}

class Stepmonitor implements Watch{
	public void apps()
	{
		System.out.println("Stepmonitoring facility");
	}
}

class Health implements Watch{
	public void apps()
	{
		System.out.println("Healthmonitoring facility");
	}
}

class Screens{
	static void touch(Watch w1) {
		w1.apps();
	}
}


public class Watches {

	public static void main(String[] args) {
		Stepmonitor s1 = new Stepmonitor();
		Health h1 = new Health();
		
		Screens.touch(h1);
		Screens.touch(s1);
	}
}

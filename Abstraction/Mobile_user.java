package Abstraction;


interface Mobile{
	void app();
}

class Music implements Mobile{
	public void app() {
		System.out.println("Music app");
	}
}

class Game implements Mobile
{
	public void app()
	{
		System.out.println("Game app");
	}
}

class Message implements Mobile
{
	public void app() {
		System.out.println("Messaging app");
	}
}

class Screen1 {
	static void uses(Mobile m1)
	{
		m1.app();
	}
}

public class Mobile_user {
	public static void main(String[] args) {
		Music m1 = new Music();
		Game g1 = new Game();
		Message m2 = new Message();
		
		Screen1.uses(m1);
		Screen1.uses(g1);
		Screen1.uses(m2);
		

	}

}

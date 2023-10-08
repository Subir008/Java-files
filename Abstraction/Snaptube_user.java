package Abstraction;

interface Snaptube{
	void apps();
}

class Youtube implements Snaptube{
	public void apps() {
		System.out.println("Youtube opened");
	}
}

class Facebook implements Snaptube{
	public void apps() {
		System.out.println("Facebook opened");
	}
}

class Instagram implements Snaptube{
	public void apps() {
		System.out.println("Instagram opened");
	}
}

class Screen{
	static void touch(Snaptube s1)
	{
		s1.apps();
	}
}

public class Snaptube_user {

	public static void main(String[] args) {
		Youtube y1 = new Youtube();
		Facebook f1 = new Facebook();
		Instagram i1 = new Instagram();
		
		Screen.touch(i1);
		Screen.touch(f1);
		Screen.touch(y1);
	}

}

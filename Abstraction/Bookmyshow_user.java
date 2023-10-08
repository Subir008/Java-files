package Abstraction;

interface Bookmyshow{
	void modul();
}

class Movie implements Bookmyshow{
	public void modul() {
		System.out.println("Book movie ticket");
	}
}

class Drama implements Bookmyshow{
	public void modul() {
		System.out.println("Drama ticket booked");
	}
}

class Touches{
	static void click(Bookmyshow b1)
	{
		b1.modul();
	}
}


public class Bookmyshow_user {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		Drama d1 = new Drama();
		
		Touches.click(d1);
		Touches.click(m1);
	}

}

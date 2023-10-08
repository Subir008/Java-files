package Polymorphism;

class Bookmyshow{
	void apps()
	{
		System.out.println("App list");
	}
}

class Movie extends Bookmyshow {
	void apps ()
	{
		System.out.println("Book movie ticket. ");
	}
}

class Concert extends Bookmyshow{
	void apps()
	{
		System.out.println("Book concert ticket.");
	}
}

class Drama extends Bookmyshow{
	void apps()
	{
		System.out.println("Book drama ticket.");
	}
}

class Touch2{
	static void open(Bookmyshow b1 )
	{
		b1.apps();
	}
}

public class Bookmyshow_user {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		Concert c1 = new Concert();
		Drama d1 = new Drama();
		
		Touch2.open(d1);
		Touch2.open(c1);
		Touch2.open(m1);
	}

}

package Abstract;

abstract class Abstr
{
	abstract void fo();
	abstract void ho();
}

abstract class Imple1 extends Abstr
{
	void fo()
	{
		System.out.println("Fofo");
	}
}

class Imple2 extends Imple1
{
	void ho()
	{
		System.out.println("Hoho");
	}
}

public class Sample2 {
	public static void main(String [] args)
	{
		Imple2 i1 = new Imple2();
		i1.fo();
		i1.ho();
	}

}

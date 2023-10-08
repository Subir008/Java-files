package Abstract;

abstract class Abst{
	abstract void mo();
	void no()
	{
		System.out.println("nono");
	}
}

class Imple extends Abst{
	void mo()
	{
		System.out.println("momo");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		Imple i1 = new Imple();
		i1.mo();
		
	}

}

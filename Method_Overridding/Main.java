package Method_Overridding;

class Amazonprime_v1
{
	void options()
	{
		System.out.println("Streaming movies, Streaming webseries");
	}
}

class Amazonprime_v2 extends Amazonprime_v1
{
	void options(){
	System.out.println("Streaming movies, Streaming webseries,Live Streaming");
	super.options();
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		Amazonprime_v2 a = new Amazonprime_v2();
		a.options();
	}
}


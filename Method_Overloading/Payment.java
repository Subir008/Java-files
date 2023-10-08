package Method_Overloading;

class Pay{
	void pays(int no)
	{
		System.out.println(no);
	}
	void pays(String text)
	{
		System.out.println(text);
	}
	void pays(int no , String text)
	{
		System.out.println(no +" " +text);
	}
	void pays(String text ,int no)
	{
		System.out.println(text +" " +no);
	}
}

public class Payment {

	public static void main(String[] args) {
		Pay p1 = new Pay();
		p1.pays(500);
		p1.pays("Online");
		p1.pays(500, "Online");
		p1.pays("Online", 500);
	}

}

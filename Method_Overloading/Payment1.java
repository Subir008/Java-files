package Method_Overloading;

class Pay1{
	static void pays(int no)
	{
		System.out.println(no);
	}
	static void pays(String text)
	{
		System.out.println(text);
	}
	static void pays(int no , String text)
	{
		System.out.println(no +" " +text);
	}
	static void pays(String text ,int no)
	{
		System.out.println(text +" " +no);
	}
}

public class Payment1 {

	public static void main(String[] args) {
		Pay1.pays(1000);
		Pay1.pays("Cash");
		Pay1.pays(1000, "Cash");
		Pay1.pays("Cash", 1000);
	}

}

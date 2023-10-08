package Method_Overloading;

class Spects1{
	void glass(int no) {
		System.out.println(no);
	}
	 void glass(String type) {
		System.out.println(type);
	}
	void glass(int no , String type) {
		System.out.println(no +" " +type);
	}
	void glass(String type, int no) {
		System.out.println(type +" " +no );
	}
}

public class Spectacle1 {

	public static void main(String[] args) {
		Spects1 s1 = new Spects1();
		s1.glass(1000);
		s1.glass("Sunglass");
		s1.glass(1000, "Sunglass");
		s1.glass("Sunglass", 1000);
	}

}

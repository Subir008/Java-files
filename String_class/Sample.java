package String_class;

public class Sample {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "java";
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}

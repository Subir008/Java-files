package String_class;

public class Stringbuilder {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Java");
		System.out.println(s1.reverse());
		System.out.println(s1.delete(2, 4));
		System.out.println(s1.deleteCharAt(0));
		
		StringBuilder s2 = new StringBuilder("Hola");
		System.out.println(s2.reverse());
		System.out.println(s2.deleteCharAt(3));
		System.out.println(s2.delete(2, 3));
	}

}

package String_class;

public class String_function {

	public static void main(String[] args) {
	String s1 = "Java";
	
	System.out.println(s1.charAt(2));
	System.out.println(s1.contains("a"));
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.startsWith("J"));
	System.out.println(s1.endsWith("a"));
	System.out.println(s1.toCharArray());
	System.out.println(s1.isEmpty());
	System.out.println(s1.substring(2));
	System.out.println(s1.substring(1, 4));
	System.out.println(s1.length());
	System.out.println(s1.concat("Mava"));
	
	String s2 = "Java is Mava";
	
	String [] str =s2.split(" ");
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
	}

}

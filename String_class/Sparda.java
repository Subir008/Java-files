package String_class;

public class Sparda {
public static void main(String[] args) {
	String s1="java";
	System.out.println(s1.charAt(1));
	System.out.println(s1.contains("v"));
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.startsWith("j"));
	System.out.println(s1.endsWith("a"));
	System.out.println(s1.toCharArray());
	System.out.println(s1.isEmpty());
	System.out.println(s1.substring(2,4));
	System.out.println(s1.length());
	System.out.println(s1.concat("Mava"));
	String s2="How do u do ";
	String str []=s2.split(" ");
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
}
}

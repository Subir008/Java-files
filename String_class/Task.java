package String_class;

public class Task {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "";
		System.out.println(s1);
		char [] arr = s1.toCharArray();
		for (int i = arr.length-1; i >= 0; i--) {
			s2 = s2 + arr[i];
		}
		System.out.println(s2);
		String s3 = s2.substring(1, 3);
		System.out.println(s3);
		String s4 = s3.toUpperCase();
		System.out.println(s4);
		String s5 = s4.concat("123");
		System.out.println(s5);
		String s6 = s5.substring(1, 3);
		System.out.println(s6);
		boolean s7 = s6.startsWith("A");
		System.out.println(s7);
		
	}

}

package String_reverse;

public class Reverse4 {

	public static void main(String[] args) {
		String s1 = "java";
		char arr [] = s1.toCharArray();
		
		for (int i = arr.length -1 ; i>= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}

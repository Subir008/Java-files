package String_reverse;

// Reverse string from an array 

class Reverse{
	static void rev(String s1) {
		String s2 = "";
		for (int i = s1.length()-1; i >= 0 ; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s1 + " reverse is " + s2);
	}
}

public class Reverse2 {

	public static void main(String[] args) {
		String str [] = {"Hi" , "Hello" , "Bye" , "Hey"};
		for (int i = 0; i < str.length; i++) {
			Reverse.rev(str[i]);
		}

	}

}

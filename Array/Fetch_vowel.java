package Array;

public class Fetch_vowel {

	static void vowel(String s1) {
		String s2 = " ";
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)== 'a' || s1.charAt(i)== 'e' || s1.charAt(i)== 'i' || 
					s1.charAt(i)== 'o' || s1.charAt(i)== 'u') {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s1 + " vowels present " +s2);
	}
	
	public static void main(String[] args) {
		String [] str = {"Hi" , "Hello" , "Hey" , "Bye"};
		for (int i = 0; i < str.length; i++) {
			vowel(str[i]);
		}

	}

}

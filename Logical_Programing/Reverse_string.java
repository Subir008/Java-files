package Logical_Programing;

class Reverse{
	String rever(String ch) {
		String x = " ";
		for (int i = ch.length()-1 ; i >= 0; i-- ) {
			x = x+ ch.charAt(i);
		}
		return x;
	}
}

public class Reverse_string {

	public static void main(String[] args) {
		Reverse r = new Reverse();
		String name = r.rever("Hello");
		System.out.println(name);
	}
}

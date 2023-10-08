package Collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet h1 = new HashSet<>();
		
		h1.add(45);
		h1.add(45);
		h1.add("Hello");
		h1.add(null);
		h1.add(50);
		System.out.println(h1);

	}

}

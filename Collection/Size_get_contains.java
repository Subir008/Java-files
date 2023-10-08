package Collection;

import java.util.ArrayList;

public class Size_get_contains {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add("Hii");
		l1.add(false);
		l1.add(55.5);
		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println();
		System.out.println( (l1.contains("Hii")));
		
	}

}

package Collection;

import java.util.*;
public class Add {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(100);
		l1.add('h');
		l1.add(20.59);
		l1.add(true);
		System.out.println(l1);
		l1.add(2, null);
		System.out.println("After "+l1 );
	}

}

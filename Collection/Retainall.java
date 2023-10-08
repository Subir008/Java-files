package Collection;

import java.util.ArrayList;

public class Retainall {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add("Hii");
		l1.add(false);
		l1.add(55.5);
		ArrayList l2 = new ArrayList();
		l2.add(20);
		l2.add("Bye");
		l2.add(true);
		l2.add(55.5);
		System.out.println("L1 "+l1);
		System.out.println("L2 "+l2);
		l1.retainAll(l2);
		System.out.println("After "+l1);

	}

}

package Collection;
import java.util.*;

public class Stack_1 {

	public static void main(String[] args) {
		Stack s1 = new Stack<>();
		s1.add(10);
		s1.add("Hello");
		s1.add(10);
		s1.add(20.56);
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
	}
}

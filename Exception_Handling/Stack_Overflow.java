package Exception_Handling;

public class Stack_Overflow {

	static void f3() {
		f3();
	}
	public static void main(String[] args) {
		f3();
	}

}

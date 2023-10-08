package Exception_Handling;

public class Stack_unwinding {
	static void f1() {
		int i = 10/0;
		System.out.println(i);
	}
	static void f2() {
		f1();
	}
	static void f3() {
		f2();
	}
	public static void main(String[] args) {
		f3();

	}

}

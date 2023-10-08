package Polymorphism;

class Vscode{
	void task() {
		System.out.println("Perform some task");
	}
}

class Html extends Vscode{
	void task() {
		System.out.println("Perform Html task");
	}
}

class Js extends Vscode{
	void task() {
		System.out.println("Perform Js task");
	}
}

class Java extends Vscode{
	void task() {
		System.out.println("Perform Java task");
	}
}

class Compiler{
	static void createpg(Vscode v1) {
		v1.task();
	}
}

public class Vscode_user {

	public static void main(String[] args) {
		Html h1 = new Html();
		Js j1 = new Js();
		Java j2 = new Java();
		
		Compiler.createpg(j1);
		Compiler.createpg(h1);
		Compiler.createpg(j2);
		
	}

}

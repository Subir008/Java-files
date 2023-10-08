package Polymorphism;

class Animals{
	void noise() {
		System.out.println("Some noise");
	}
}

class Dog extends Animals{
	void noise() {
		System.out.println("Bhow Bhow");
	}
}

class Cat extends Animals{
	void noise() {
		System.out.println("Meow Meow");
	}
}

class Snake extends Animals{
	void noise() {
		System.out.println("Hiss Hisss");
	}
}

class Zoo{
	static void hear(Animals a1) {
		a1.noise();
	}
}

public class Animal {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Snake s1 = new Snake();
		
		Zoo.hear(d1);
		Zoo.hear(c1);
		Zoo.hear(s1);

	}

}

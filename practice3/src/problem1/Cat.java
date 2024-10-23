package problem1;

public class Cat extends Animal {
	private int age;
	
	public Cat() {
		super();
		age = 0;
	}
	
	public Cat(int age) {
		super();
		this.age = age;
	}
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void set(int newAge) {
		age = newAge;
	}
	
	public void set(String newName, int newAge) {
		super.setName(newName);
		age = newAge;
	}
	
	public void sound() {
		System.out.println("Meow.");
	}
	
	public static void main(String args[]) {
		Animal myAnimal = new Cat();
		myAnimal.sound();
	}
}


package problem1;

public class Animal {
	String name;
	
	public Animal() {
		name = "no name yet";
	}
	
	public Animal (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void sound() {
		System.out.println("Sound.");
	}
}

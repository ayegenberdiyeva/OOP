package problem5;

import java.util.Vector;

import problem5.Person.Gender;

public class DragonLaunch {
	private Vector<Person> kidnappedStu;
	
	public DragonLaunch() {
		kidnappedStu = new Vector<>();
	}
	
	public void kidnap(Person p) {
		kidnappedStu.add(p);
	}
	
	public void willDragonEatOrNot() {
		boolean foundPair;
		do {
			foundPair = false;
			for (int i = 0; i<kidnappedStu.size()-1; i++) {
				if (kidnappedStu.get(i).getGender() == Gender.BOY &&kidnappedStu.get(i+1).getGender() == Gender.GIRL) {
					kidnappedStu.remove(i);					
					kidnappedStu.remove(i);
					foundPair = true;
					break;
				}
			}
		} while (foundPair);
		
		if (kidnappedStu.isEmpty()) {
			System.out.println("The dragon will have no lunch.");
		} else {
			System.out.println("The dragon will eat: ");
			for (Person student : kidnappedStu) {
				System.out.print(student + " ");
			}
		}
	}
	
	public static void main(String args[]) {
		DragonLaunch dl1 = new DragonLaunch();
		
		dl1.kidnap(new Person(Gender.BOY));
		dl1.kidnap(new Person(Gender.BOY));
		dl1.kidnap(new Person(Gender.GIRL));
		dl1.kidnap(new Person(Gender.GIRL));
		
		dl1.willDragonEatOrNot();

		DragonLaunch dl2 = new DragonLaunch();
		
		dl2.kidnap(new Person(Gender.GIRL));
		dl2.kidnap(new Person(Gender.BOY));
		dl2.kidnap(new Person(Gender.GIRL));
		dl2.kidnap(new Person(Gender.BOY));
		
		dl2.willDragonEatOrNot();
	}
}

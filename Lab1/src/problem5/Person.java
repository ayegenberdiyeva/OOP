package problem5;

public class Person {
	public enum Gender {
		BOY, GIRL
	}
	
	private Gender gender;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String toString() {
		return gender == Gender.BOY ? "B" : "G";
	}
}

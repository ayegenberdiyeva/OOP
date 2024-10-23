package example;

public class Course {
	private String name;
	private String description;
	private int numberOfCredits;
	private String prerequisites;
	
	public Course(String name, String description, int numberOfCredits, String prerequisites ) {
		this.name = name;
		this.description = description;
		this.numberOfCredits = numberOfCredits;
		this.prerequisites = prerequisites;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Course{" +
				"name='" + name +'\'' +
				", description='" + description + '\'' +
				", credits='" + numberOfCredits + '\'' +
				", prerequisites='" + prerequisites + '\'' +
				'}';
	}
}

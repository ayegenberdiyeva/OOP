package practice2;

public class Student {
	private String name;
	private int id;
	private int year_of_study;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.year_of_study = 1;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getYearOfStudy() {
		return year_of_study;
	}

	public void incrementYearOfStudy() {
		year_of_study++;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", ID: " + id + ", Year of Study: " + year_of_study);
	}

	public static void main(String args[]) {
		Student student1 = new Student("Amina", 23010101);

		System.out.println("Name: " + student1.getName());
		System.out.println("Student ID: " + student1.getId());
		System.out.print("Year: " + student1.getYearOfStudy());

		student1.incrementYearOfStudy();
		System.out.println("Year after increment: " + student1.getYearOfStudy());
	}
}

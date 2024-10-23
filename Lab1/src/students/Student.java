package students;

public class Student {
	private String name;
	private int id;
	private int year_of_study;
	private double grade;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.year_of_study = 1;
		this.grade = 0.0;
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
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void incrementYearOfStudy() {
		year_of_study++;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", ID: " + id + ", Year of Study: " + year_of_study + ", grade: " + grade);
	}

//	public static void main(String args[]) {
//		Student student1 = new Student("Amina", "A");
//
//		System.out.println("Name: " + student1.getName());
//		System.out.println("Student ID: " + student1.getId());
//		System.out.print("Year: " + student1.getYearOfStudy());
//
//		student1.incrementYearOfStudy();
//		System.out.println("Year after increment: " + student1.getYearOfStudy());
//		
//		student1.setGrade(90);
//		System.out.println("Grade: " + student1.getGrade());
//	}
}

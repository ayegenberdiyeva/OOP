package example;

import students.Student;

import java.util.Scanner;

public class GradeBookTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		Course course = new Course ("CS101", "Object-Oriented Programming and Design", 3, "None");
		
		GradeBook gradebook = new GradeBook(course);
		
		System.out.println("Enter number of students: ");
		int numberOfStu = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i<numberOfStu; i++) {
			System.out.println("Enter student name: ");
			String name = scanner.nextLine();
			
			scanner.nextLine();
			
			System.out.println("Enter student ID: ");
			int id = scanner.nextInt();
			
			Student stu = new Student(name, id);
			gradebook.addStudent(stu);
		}
		
		gradebook.displayMessage();
		gradebook.displayGradeReport();
		
		scanner.close();
	}
}

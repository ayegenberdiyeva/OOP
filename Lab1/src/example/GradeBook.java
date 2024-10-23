package example;

import students.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GradeBook {
	Scanner scanner = new Scanner(System.in);
	
	private Course course;
	private List<Student> students;
	
	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + course.getName() + "!");
	}
	
	public void displayGradeReport() {
		System.out.println("\nPlease input grades for students:");
		for (Student student : students) {
			System.out.print("Student " + student.getName() + ": ");
			student.setGrade(scanner.nextDouble());
		}
		
		System.out.println("\nGrade Report: ");
		determineClassAverage();
		
        determineBestAndLowestGrade();
        outputBarChart();
	}
	
	private void determineClassAverage() {
		double total = 0;
		for (Student student : students) {
			total += student.getGrade();
		}
		
		double ave = total /students.size();
		System.out.print("Class average is " + ave);
	}
	
	private void determineBestAndLowestGrade() {
		Student bestStu = students.get(0);
		Student lowestStu = students.get(0);
		
		for (Student student : students) {
			if (student.getGrade() > bestStu.getGrade()) {
				bestStu = student;
			}
			if (student.getGrade() < lowestStu.getGrade()) {
				lowestStu = student;
			}
		}
		
		System.out.println("Lowest grade is " + lowestStu.getGrade() + " (Student " + lowestStu.getName() + ", id: " + lowestStu.getId() + ").");
		System.out.println("Highest grade is " + bestStu.getGrade() + " (Student " + bestStu.getName() + ", id: " + bestStu.getId() + ").");
	}
	
	private void outputBarChart() {
		Map<String, Integer> gradeDistribution = new LinkedHashMap<>();
		for (int i = 0; i<=100; i+=10) {
			if (i == 100) {
				gradeDistribution.put("100", 0);
			} else {
				gradeDistribution.put(i + "-" + (i+9), 0);
			}
		}
		
		
		for (Student student : students) {
			int grade = (int) student.getGrade();
			if (grade == 100){
				gradeDistribution.put("100", gradeDistribution.get("100")+1);
			} else {
				for (int i = 0; i<100; i+=10) {
					if (grade >= i && grade < i+10) {
						gradeDistribution.put(i + "-" + (i+9), gradeDistribution.get(i + "-" + (i + 9)) + 1);
						break;
					}
				}
			}
		}
		
		System.out.println("Grade distribution: ");
		
		List<String> keys = new ArrayList<>(gradeDistribution.keySet());
		Collections.sort(keys);
		
	    Collections.sort(keys, (a, b) -> {
	        if (a.equals("100")) return 1; 
	        if (b.equals("100")) return -1;
	        return a.compareTo(b); 
	    });
		
		for (String key : keys) {
			System.out.printf("%s: %s%n", key, "*".repeat(gradeDistribution.get(key)));
		}
	}
	
	public String toString() {
		return "GradeBook{" +
				"course=" + course +
				", students=" + students +
				'}';
	}
}

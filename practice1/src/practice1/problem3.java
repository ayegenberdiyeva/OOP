package practice1;

import java.util.Scanner;

public class problem3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int grade = input.nextInt();
		
		if (grade < 50 && grade >= 0) {
			System.out.print("F");
		} else if (grade <= 54 && grade >= 50) {
			System.out.print("D");
		} else if (grade <= 59 && grade >= 55) {
			System.out.print("D+");
		} else if (grade <= 64 && grade >= 60) {
			System.out.print("C-");
		} else if (grade <= 69 && grade >= 65) {
			System.out.print("C");
		} else if (grade <= 70 && grade >= 74) {
			System.out.print("C+");
		} else if (grade <= 75 && grade >= 79) {
			System.out.print("B-");
		} else if (grade <= 80 && grade >= 84) {
			System.out.print("B");
		} else if (grade <= 89 && grade >= 85) {
			System.out.print("B+");
		} else if (grade <= 94 && grade >= 90) {
			System.out.print("A-");
		} else if (grade <= 100 && grade >= 95) {
			System.out.print("A");
		} else {
			System.out.print("error");
		}
		
		input.close();
	}
}

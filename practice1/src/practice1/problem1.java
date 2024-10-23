package practice1;

//import java.util.Scanner;

public class problem1 {
	public static void main(String args[]) {
//		Scanner input = new Scanner(System.in);
//		
//		String name = input.next();
		String name = "Amina";
		int length = name.length();
		
		
		System.out.print("+");
		for (int i = 0; i<length; i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		System.out.println("|" + name + "|");

		System.out.print("+");
		for (int i = 0; i<length; i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
	}

}

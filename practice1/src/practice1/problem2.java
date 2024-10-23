package practice1;

import java.util.Scanner;

public class problem2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Eneter length of square: ");
		int a = input.nextInt();
		
		System.out.println("Area = " + a*a);
		System.out.println("Perimeter = " + a*4);
		System.out.println("Length of diagonal = " + (int)Math.pow(a, 0.5));
		
		input.close();
	}
}

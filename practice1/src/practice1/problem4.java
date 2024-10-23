package practice1;

import java.util.Scanner;

public class problem4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int D = ((int)Math.pow(b, 2)) - (4*a*c);
		
		if (D < 0) {
			System.out.println("Discriminant is negative, no solution/infinitly many solutions.");
		} else {
			int ans = ( -b - (int)Math.pow(D, 0.5)) / (2*a);
			System.out.println("First answer is " + ans);
			ans = ( -b + (int)Math.pow(D, 0.5)) / (2*a);
			System.out.println("Second answer is " + ans);
		}
		
		input.close();
	}
}

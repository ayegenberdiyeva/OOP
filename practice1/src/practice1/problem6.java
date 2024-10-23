package practice1;

import java.util.Scanner;

public class problem6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Word: ");
		String word = input.next();
		int length = word.length();
		
		for (int i = 0; i < length/2; i++) {
			if (word.charAt(i) != word.charAt(length-1-i)) {
				System.out.println("Word is not Palindrome.");
				input.close();
				return;
			}
		} 
		
		System.out.println("Word is Palindrome.");
		
		input.close();
	}

}

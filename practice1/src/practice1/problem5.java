package practice1;

import java.util.Scanner;

public class problem5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter yout initial balance: ");
		int ini_balance = input.nextInt();

		System.out.print("Enter yout interest rate: ");
		int interest_rate = input.nextInt();
		
		int new_balance = ini_balance * interest_rate;
		System.out.println("Your new balance is " + new_balance);
		
		input.close();
	}

}

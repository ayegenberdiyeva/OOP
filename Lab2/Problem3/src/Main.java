import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        bank.openAccount(new SavingAccount(1001, 2.0));
        bank.openAccount(new CheckingAccount(1002));

        while (run) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Display all accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Add interest/deduct fees");
            System.out.println("6. Open new account");
            System.out.println("7. Close account");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bank.displayAccounts();
            }
        }
    }
}
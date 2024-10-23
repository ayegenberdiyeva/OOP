public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.accNumber = accNumber;
        balance = 0.0;
    }

    public void deposit(double sum) {
        if (sum > 0){
            balance += sum;
            System.out.println("Deposited " + sum + " to " + accNumber);
        } else {
            System.out.println("Insufficient deposit amount");
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && balance >= sum) {
            balance -= sum;
            System.out.println("Withdrawn " + sum + " to " + accNumber);
        } else {
            System.out.println("Insufficient withdrawal amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && balance >= amount) {
            withdraw(amount);
            other.deposit(amount);
            System.out.println("Transferred " + amount + " to " + other.getAccNumber());
        } else {
            System.out.println("Transfer failed");
        }
    }

    public String toString() {
        return "Account number: " + accNumber
                + " -> balance: " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}

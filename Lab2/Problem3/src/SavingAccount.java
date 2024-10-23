public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accNum, double interestRate) {
        super(accNum);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }

    public String toString() {
        return super.toString() + " - Saving Account (interest rate): " + interestRate + "%";
    }
}

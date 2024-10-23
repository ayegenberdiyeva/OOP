public class CheckingAccount extends Account {
    private static final int FREE_TRANSACTIONS_LIMIT = 3;
    private static final double TRANSACTION_FEE = 0.02;
    private int transactionsCount;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionsCount = 0;
    }

    public void deposit(double sum) {
        super.deposit(sum);
        transactionsCount++;
    }

    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionsCount++;
    }

    public void deductFee() {
        if (transactionsCount > FREE_TRANSACTIONS_LIMIT) {
            int excessTransactions = transactionsCount - FREE_TRANSACTIONS_LIMIT;
            double fee = TRANSACTION_FEE * excessTransactions;
            super.withdraw(fee);
            System.out.println("Fee deducted for " + excessTransactions + " excess transactions: " + fee);
        }
        transactionsCount = 0;
    }

    public String toString() {
        return super.toString() + " - Checking Account (Transaction): " + transactionsCount;
    }
}

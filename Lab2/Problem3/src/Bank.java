import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened: " + account.toString());
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(account -> account.getAccNumber() == accNumber);
        System.out.println("Account " + accNumber + " closed");
    }

    public void update(){
        for (Account account : accounts) {
            if (account instanceof SavingAccount){
                ((SavingAccount) account).addInterest();
            } else if (account instanceof CheckingAccount){
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}

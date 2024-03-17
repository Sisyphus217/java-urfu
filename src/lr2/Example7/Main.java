package lr2.Example7;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000.0);
        Transaction transaction = new Transaction(myAccount);

        transaction.executeDeposit(500.0);
        transaction.executeWithdraw(200.0);
        System.out.println("Current balance: " + transaction.getCurrentBalance());
    }
}

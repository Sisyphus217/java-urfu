package lr2.Example7;

public class Transaction {
    private Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    public void executeDeposit(double amount) {
        account.deposit(amount);
    }

    public void executeWithdraw(double amount) {
        account.withdraw(amount);
    }

    public double getCurrentBalance() {
        return account.getBalance();
    }
}

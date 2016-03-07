package Practice2.prob3;

public class Account {
    public String accountNo;
    public int balance = 0;

    Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void save(int money) {
        balance += money;
    }

    public void deposit(int money) {
        balance -= money;
    }

}

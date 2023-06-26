package Task2;

public abstract class Account {
    protected int deposit = 0;

    public Account(int deposit) {
        this.deposit = deposit;
    }

    abstract void pay(int amount);
    abstract void transfer(Account account, int amount);
    abstract boolean addMoney(int amount);
}
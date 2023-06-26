package Task2;

public class Program {
    public static void main(String[] args) {
        Account credit = new CreditAccount(-9000);
        Account checking = new CheckingAccount(5000);
        Account saving = new SavingAccount(76000);

        credit.pay(4000);
        credit.addMoney(9000);
        credit.transfer(saving, 10000);

        saving.addMoney(10000);
        saving.pay(15000);
        saving.transfer(checking, 80000);

        checking.transfer(credit, 1000);
    }
}
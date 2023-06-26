package Task2;

public class SavingAccount extends Account {

    public SavingAccount(int deposit) {
        super(deposit);
    }

    @Override
    void pay(int amount) {
        System.out.println("Со сберегательного счета нельзя платить");
    }

    @Override
    void transfer(Account account, int amount) {
        if (amount > deposit) {
            System.out.println("Сумма перевода: "+amount+", баланс: "+deposit);
            System.out.println("Нельзя переводить больше, чем есть на счету.");
        } else {
            if (account.addMoney(amount)) {
                deposit -= amount;
            }
        }
    }

    @Override
    boolean addMoney(int amount) {
        deposit += amount;
        System.out.println("Баланс сберегательного счета пополнен на " + amount + ", сумма на счету " + deposit);
        return true;
    }
}
package Task2;

public class CreditAccount extends Account {

    public CreditAccount(int deposit) {
        super(deposit);
    }

    @Override
    void pay(int amount) {
        deposit -= amount;
        System.out.println("Операция выполнена, баланс: " + deposit);
    }

    @Override
    void transfer(Account account, int amount) {
        System.out.println("Операция не поддерживается");
    }

    @Override
    boolean addMoney(int amount) {
        if (deposit + amount > 0) {
            System.out.println("Итоговая сумма пополнения превышает кредит, текущая задолженность: " + deposit);
            return false;
        } else {
            deposit += amount;
            return true;
        }
    }
}
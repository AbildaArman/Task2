package Task2;

public class CheckingAccount extends Account {

    public CheckingAccount(int deposit) {
        super(deposit);
    }

    @Override
    void pay(int amount) {
        if (amount > deposit) {
            System.out.println("Сумма покупки превышает лимит, текущий баланс: "+ deposit);
        } else {
            deposit -= amount;
        }
    }

    @Override
    void transfer(Account account, int amount) {
        if (amount > deposit) {
            System.out.println("Сумма перевода превышает лимит, текущий баланс: "+ deposit);
        } else {
            if (account.addMoney(amount)) {
                deposit -= amount;
            }
        }
        }

        @Override
        boolean addMoney(int amount) {
            deposit += amount;
            System.out.println("Баланс пополнена на " + amount + ", сумма на счету " + deposit);
            return true;
        }
}

package ModelData.Bank;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private long card;
    private static long idCard;
    private long balance;

    public BankAccount() {
        this.card = idCard + 1;
        idCard = this.card;
        this.balance = 1000;
    }

    public long getCard() {
        return card;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}

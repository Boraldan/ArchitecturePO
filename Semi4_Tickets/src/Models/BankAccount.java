package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private long card;
    private static long idCard;
    private int balance;

    public BankAccount() {
        this.card = idCard + 1;
        idCard = this.card;
        this.balance = 1000;
    }

    public long getCard() {
        return card;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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

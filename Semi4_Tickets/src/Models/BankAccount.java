package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

//    private User user;
    private long card;
    private int balance;
//    private long oldCard;

    public BankAccount(int num) {
//        this.user = new User()
        try {
            this.card = num;
        } catch (Exception e) {
            System.out.println("Проблема в BankAccount");
        }
//        oldCard = this.card;
        balance = 1000;
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

//    public long getOldCard() {
//        return oldCard;
//    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}

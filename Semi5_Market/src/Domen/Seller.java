package Domen;

public class Seller {
    private int idSeller;
    private static int idSellerCounter;
    private String name;
    private long cardNumber;

    public Seller(String name, long cardNumber) {
        this.idSeller = ++idSellerCounter;
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public int getIdSeller() {
        return idSeller;
    }

    public String getName() {
        return name;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
}

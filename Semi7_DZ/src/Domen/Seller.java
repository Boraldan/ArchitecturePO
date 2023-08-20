package Domen;

public class Seller {
    private String name;
    private long INN;
    private String address;
    private long card;

    public Seller(String name, long INN, String address, long card) {
        this.name = name;
        this.INN = INN;
        this.address = address;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getINN() {
        return INN;
    }

    public void setINN(long INN) {
        this.INN = INN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }
}

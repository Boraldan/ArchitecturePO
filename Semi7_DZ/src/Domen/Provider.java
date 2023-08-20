package Domen;

public class Provider {
    private static int idCounter;
    private int id;
    private String name;
    private String address;
    private long INN;
    private long card;
    private long rating;

    public Provider(String name, String address, long INN, long card, long rating) {
        this.id = ++idCounter;
        this.name = name;
        this.address = address;
        this.INN = INN;
        this.card = card;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getINN() {
        return INN;
    }

    public void setINN(long INN) {
        this.INN = INN;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }
}

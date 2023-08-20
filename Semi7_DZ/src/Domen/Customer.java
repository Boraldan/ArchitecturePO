package Domen;

public class Customer {
    private static int idCounter;
    private int id;
    private String name;

    private long INN;
    private String address;

    public Customer(String name, long INN, String address) {
        this.id = ++idCounter;
        this.name = name;
        this.INN = INN;
        this.address = address;
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
}

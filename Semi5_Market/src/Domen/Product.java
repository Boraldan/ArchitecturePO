package Domen;

public abstract class Product {
    private int id;
    private String name;
    private static int idCounter;
    private long prise;


    public Product(String name, long prise) {
        this.id = ++idCounter;
        this.name = name;
        this.prise = prise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrise() {
        return prise;
    }

    public void setPrise(long prise) {
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

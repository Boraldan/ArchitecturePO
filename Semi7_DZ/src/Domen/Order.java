package Domen;

import Domen.Product.Product;

import java.util.Date;

public class Order {
    private static int idCounter;
    private int idOrder;
    private Seller seller;
    private Provider provider;
    private Customer customer;
    private Product product;
    private float volume;
    private String deliverAddress;
    private boolean pay;
    private Date date;

    public Order(Seller seller, Provider provider, Customer customer, Product product,
                 String deliverAddress, float volume, boolean pay, Date date) {
        this.idOrder = ++idCounter;
        this.seller = seller;
        this.provider = provider;
        this.customer = customer;
        this.product = product;
        this.deliverAddress = deliverAddress;
        this.volume = volume;
        this.pay = pay;
        this.date = date;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getSum() {
        return volume * product.getPrice();
    }
}

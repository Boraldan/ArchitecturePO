package Domen;

public class Order {
    private int idOrder;
    private static int idOrderCounter;
    private Seller seller;
    private User user;
    private Cart cart;
    private boolean pay = false;

    public Order(Seller seller, User user, Cart cart) {
        this.idOrder = ++idOrderCounter;
        this.seller = seller;
        this.user = user;
        this.cart = cart;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }
}

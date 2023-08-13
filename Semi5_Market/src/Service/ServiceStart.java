package Service;

import Domen.Cart;
import Domen.Product;

import java.util.List;

public class ServiceStart {

    private Cart cartStart;
    private List<Product> startList;

    public ServiceStart(List<Product> startList) {
        this.cartStart = new Cart();
        this.startList = startList;
     }

    public Cart getCartStart() {
        return cartStart;
    }

    public void setCartStart(Cart cartStart) {
        this.cartStart = cartStart;
    }

    public List<Product> getStartList() {
        return startList;
    }

    public void setStartList(List<Product> startList) {
        this.startList = startList;
    }

}

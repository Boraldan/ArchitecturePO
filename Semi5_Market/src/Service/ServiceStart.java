package Service;

import Domen.Cart;
import Domen.Product;

import java.util.ArrayList;
import java.util.List;

public class ServiceStart {

    private Cart cartStart;
    private List<Product> startList;

    private ServiceProvider serviceProvider;

    public ServiceStart(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
        this.cartStart = new Cart();
        this.startList = new ArrayList<>();
     }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
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

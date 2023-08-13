package Domen;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> cartList;
    private long sum = sumProducts();

    public Cart() {
        this.cartList = new ArrayList<>();
    }

    public List<Product> getCartList() {
        return cartList;
    }

    public void setCartList(List<Product> cartList) {
        this.cartList = cartList;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    private long sumProducts() {
        long tempSum = 0;
        for (Product el : this.cartList) {
            tempSum += el.getPrise();
        }
        return tempSum;
    }

}

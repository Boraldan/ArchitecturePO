package UseCase;

import Domen.Order;

import java.util.List;

public class ServiceOrder {
    private List<Order> orderList;

    public ServiceOrder(List<Order> orderList) {
        this.orderList = orderList;
    }

    public float sumSale() {
        float sum = 0;
        for (Order el : orderList) {
            sum += el.getSum();
        }
        return sum;
    }

}

package Service;

import Domen.Order;
import Domen.Seller;
import ModelData.RepoOrders;
import ModelData.Сarriers.Carrier;

public class ServiceOrder {

    private Order order;

    private Carrier carrier;
    public ServiceOrder(ServiceАrz serviceАrz, Carrier carrier) {
        this.order = new Order(new Seller("Seller", 1),
                serviceАrz.getUser(), serviceАrz.getCartArz());
//        new RepoOrders().getList().add(ord);  добавляем ордер в список ордеров
    }

    public Order getOrder() {
        return order;
    }


}

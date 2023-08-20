package ModelData.Repo;

import Domen.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepoOrder {
    private static RepoOrder orderRepository;
    private List<Order> order;

    private RepoOrder() {
        this.order = new ArrayList<>();
        order.add(new Order(
                RepoSeller.getSellerRepo().getSeller().get(0),
                RepoProvider.getRepoProvider().getProvider().get(0),
                RepoCustomer.getCustomerRepo().getCustomer().get(0),
                RepoProduct.getRepoProductrRepo().getProduct().get(0),
                "Pskov",  10, true, new Date(10 - 10 - 2023)
        ));
    }

    public static RepoOrder getRepoOrder() {
        if (orderRepository == null) {
            orderRepository = new RepoOrder();
        }
        return orderRepository;
    }

    public List<Order> getOrder() {
        return order;
    }
}

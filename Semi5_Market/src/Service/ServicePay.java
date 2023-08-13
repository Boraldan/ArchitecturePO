package Service;

import Domen.Order;
import ModelData.Bank.CashProvider;

public class ServicePay {
    private ServiceOrder serviceOrder;
    private CashProvider cashProvider;

    public ServicePay(ServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
        this.cashProvider = new CashProvider();
    }

    public boolean payOrder(Order order) throws RuntimeException {
        boolean flag;
        cashProvider.authorization(order.getUser());
        flag = cashProvider.buy(order);
        return flag;
    }

    public ServiceOrder getServiceOrder() {
        return serviceOrder;
    }
}

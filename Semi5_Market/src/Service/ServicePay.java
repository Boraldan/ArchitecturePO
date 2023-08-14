package Service;

import Domen.Order;


public class ServicePay {
    private ServiceOrder serviceOrder;
    private ServiceProvider serviceProvider;

    public ServicePay(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public boolean payOrder(Order order) throws RuntimeException {
        boolean flag;
        serviceProvider.getPresenter().getiRepo().getCashProvider().authorization(order.getUser());
        flag = serviceProvider.getPresenter().getiRepo().getCashProvider().buy(order);
        return flag;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public void setServiceOrder(ServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public ServiceOrder getServiceOrder() {
        return serviceOrder;
    }
}

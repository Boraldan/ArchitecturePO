package Service;


import Presenter.Presenter;
import Service.ServiceProduct.ServiceBike;
import Service.ServiceProduct.ServiceCar;

public class ServiceProvider implements IServiceProvider {

    private Presenter presenter;

    public Presenter getPresenter() {
        return presenter;
    }

    public ServiceProvider(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public ServiceCar getServiceCar() {
        return new ServiceCar(this);
    }

    @Override
    public ServiceBike getServiceBike() {
        return new ServiceBike(this);
    }

    public ServiceStart getServiceStart() {
        return new ServiceStart(this);
    }

    public ServiceUser getServiceUser() {
        return new ServiceUser(this);
    }

    @Override
    public ServiceАrz getServiceArz() {
        return new ServiceАrz(this);

    }

    @Override
    public ServicePay getServicePay() {
        return new ServicePay(this);
    }

}

//    @Override
//    public ServiceOrder getServiceOrder() {
//        return null;

//    }

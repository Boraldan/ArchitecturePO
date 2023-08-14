package Service;

import Service.ServiceProduct.ServiceBike;
import Service.ServiceProduct.ServiceCar;

public interface IServiceProvider {
    ServiceCar getServiceCar();

    ServiceBike getServiceBike();

    ServiceStart getServiceStart();

    ServiceUser getServiceUser();
    ServiceАrz getServiceArz();

    ServicePay getServicePay();

    //    ServiceOrder getServiceOrder();

}

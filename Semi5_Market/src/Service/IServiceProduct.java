package Service;

import Service.ServiceProduct.ServiceBike;
import Service.ServiceProduct.ServiceCar;

public interface IServiceProduct {
    ServiceCar getServiceCar();

    ServiceBike getServiceBike();

}

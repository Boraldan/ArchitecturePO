package Service;


import Service.ServiceProduct.ServiceBike;
import Service.ServiceProduct.ServiceCar;

public class ServiceProvider implements IServiceProduct {

    @Override
    public ServiceCar getServiceCar() {
        ServiceCar serviceCar = new ServiceCar();
        return serviceCar;
    }

    @Override
    public ServiceBike getServiceBike() {
        ServiceBike serviceBike = new ServiceBike();
        return serviceBike;
    }
    public ServiceUser getServiceUser(){
        ServiceUser serviceUser = new ServiceUser();
        return serviceUser;
    }


}

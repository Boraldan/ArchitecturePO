package Service.ServiceProduct;

import Domen.Products.ProductCar;
import Service.ServiceProvider;

import java.util.List;

public class ServiceCar {
    private List<ProductCar> carList;
    private ServiceProvider serviceProvider;

    public ServiceCar(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
        this.carList = serviceProvider.getPresenter().getiRepo().getRepoCar().getCarList();
    }

    public void setCarList(List<ProductCar> carList) {
        this.carList = carList;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public ProductCar getCar(int index) {
        return carList.get(index);
    }

    public int idFind(int id) {
        for (ProductCar el : carList) {
            if (el.getId() == id)
                return el.getId();
        }
        return -1;
    }

    public List<ProductCar> getCarList() {
        return carList;
    }
}

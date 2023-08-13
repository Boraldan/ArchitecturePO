package Service.ServiceProduct;

import Domen.Products.ProductCar;
import ModelData.RepoCar;

import java.util.List;

public class ServiceCar {
    private List<ProductCar> carList;

    public ServiceCar() {
        RepoCar repoCar = new RepoCar();
        this.carList = repoCar.getCarList();
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

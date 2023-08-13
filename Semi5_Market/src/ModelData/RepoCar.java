package ModelData;

import Domen.Products.ProductCar;

import java.util.ArrayList;
import java.util.List;

public class RepoCar {
    private List<ProductCar> carList;

    public RepoCar() {
        this.carList = new ArrayList<>();
        carList.add(new ProductCar("Volvo", 10, "sv70"));
        carList.add(new ProductCar("BMW", 20, "m5"));
    }

    public List<ProductCar> getCarList() {
        return carList;
    }



}

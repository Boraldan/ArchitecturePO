package Domen.Products;

import Domen.Product;

public class ProductCar extends Product {
    private String model;

    public ProductCar(String name, long prise, String model) {
        super(name, prise);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Domen.Product{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\''+
                "model='" + model + '\'' +
                '}';
    }
}

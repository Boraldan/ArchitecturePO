package Service.ServiceProduct;

import Domen.Products.ProductBike;
import ModelData.RepoBike;

import java.util.List;

public class ServiceBike {
    private List<ProductBike> bikeList;

    public ServiceBike() {
        RepoBike repoBike = new RepoBike();
        this.bikeList = repoBike.getBikeList();
    }

    public ProductBike getBike(int index) {
        return bikeList.get(index);
    }

    public int idFind(int id) {
        for (ProductBike el : bikeList) {
            if (el.getId() == id)
                return el.getId();
        }
        return -1;
    }
}

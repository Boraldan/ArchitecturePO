package Service.ServiceProduct;

import Domen.Products.ProductBike;
import Service.ServiceProvider;

import java.util.List;

public class ServiceBike {
    private List<ProductBike> bikeList;
    private ServiceProvider serviceProvider;

    public ServiceBike(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
        this.bikeList = serviceProvider.getPresenter().getiRepo().getRepoBike().getBikeList();
    }

    public List<ProductBike> getBikeList() {
        return bikeList;
    }

    public void setBikeList(List<ProductBike> bikeList) {
        this.bikeList = bikeList;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
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

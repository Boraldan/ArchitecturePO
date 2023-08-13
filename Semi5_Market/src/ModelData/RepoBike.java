package ModelData;

import Domen.Products.ProductBike;


import java.util.ArrayList;
import java.util.List;

public class RepoBike {
    private List<ProductBike> repoList;

    public RepoBike() {
        this.repoList = new ArrayList<>();
        repoList.add(new ProductBike("Bike1", 1, "s1"));
        repoList.add(new ProductBike("Bike2", 2, "s2"));
    }

    public List<ProductBike> getBikeList() {
        return repoList;
    }


}

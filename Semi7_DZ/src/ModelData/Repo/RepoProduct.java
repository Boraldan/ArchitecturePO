package ModelData.Repo;

import Domen.Product.Category;
import Domen.Product.Product;
import Domen.Product.SubCat;
import Domen.Product.Type;

import java.util.ArrayList;
import java.util.List;

public class RepoProduct {

    private static RepoProduct repoProduct;
    private List<Product> product;


    private RepoProduct() {
        //имитация работы базы
        product = new ArrayList<>();
        product.add(new Product("Lada", Type.CAR, Category.SLOW, SubCat.two,
                150, 10, "2023", 7, false,
                RepoProvider.getRepoProvider().getProvider().get(0)));

    }

    public static RepoProduct getRepoProductrRepo() {
        if (repoProduct == null) {
            repoProduct = new RepoProduct();
        }
        return repoProduct;
    }

    public List<Product> getProduct() {
        return product;
    }
}

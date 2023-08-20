package ModelData.Repo;


import Domen.Seller;

import java.util.ArrayList;
import java.util.List;

public class RepoSeller {
    private static RepoSeller repoSeller;
    private List<Seller> seller;

    private RepoSeller() {
        //имитация работы базы
        seller = new ArrayList<>();
        seller.add(new Seller("Seller", 000, "Pekit", 123));

    }

    public static RepoSeller getSellerRepo() {
        if (repoSeller == null) {
            repoSeller = new RepoSeller();
        }
        return repoSeller;
    }

    public List<Seller> getSeller() {
        return seller;
    }
}

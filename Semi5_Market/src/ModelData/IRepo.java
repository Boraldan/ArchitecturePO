package ModelData;

import ModelData.Bank.CashProvider;
import ModelData.Сarriers.RepoCarrier;

public interface IRepo {
    RepoBike getRepoBike();

    RepoCar getRepoCar();

    RepoOrders getRepoOrder();

    RepoUser getRepoUser();

    CashProvider getCashProvider();

    RepoCarrier getRepoCarrier();
}

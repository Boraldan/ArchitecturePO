package ModelData;

import ModelData.Bank.CashProvider;
import ModelData.Сarriers.RepoCarrier;

public class RepoProvider implements IRepo {
    @Override
    public RepoBike getRepoBike() {
        return new RepoBike();
    }

    @Override
    public RepoCar getRepoCar() {
        return new RepoCar();
    }

    @Override
    public RepoOrders getRepoOrder() {
        return null;
    }

    @Override
    public RepoUser getRepoUser() {
        return RepoUser.getClientRepository();
    }

    @Override
    public CashProvider getCashProvider() {
        return new CashProvider();
    }

    @Override
    public RepoCarrier getRepoCarrier() {
        return null;
    }
}

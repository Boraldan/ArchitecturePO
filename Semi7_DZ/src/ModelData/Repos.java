package ModelData;

import Domen.Order;
import ModelData.Repo.RepoOrder;

import java.util.List;

public class Repos implements IRepo{
    @Override
    public List<Order> getOrder() {
        return RepoOrder.getRepoOrder().getOrder();
    }
}

import Adapter.Adapter;
import ModelData.Repos;
import UseCase.ServiceProvider;

public class Main {
    public static void main(String[] args) {

        Repos repos = new Repos();
        ServiceProvider serviceProvider = new ServiceProvider(repos);
        Adapter adapter = new Adapter(serviceProvider);
        adapter.sumOrder();


    }
}
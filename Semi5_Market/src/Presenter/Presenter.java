package Presenter;

import ModelData.IRepo;
import ModelData.RepoProvider;
import Service.IServiceProvider;
import Service.ServiceProvider;
import View.View;

public class Presenter {

    private View view;
    private IServiceProvider serviceProduct;
    private IRepo iRepo;

    public Presenter() {
        this.view = new View(this);
        this.serviceProduct = new ServiceProvider(this);
        this.iRepo = new RepoProvider();
    }

    public IServiceProvider getServiceProduct() {
        return serviceProduct;
    }

    public View getView() {
        return view;
    }

    public IRepo getiRepo() {
        return iRepo;
    }
}

package Presenter;

import Service.IServiceProduct;
import Service.ServiceProvider;
import View.View;

public class Presenter {

    private View view;
    private IServiceProduct serviceProduct;

    public Presenter() {
        this.view = new View(this);
        this.serviceProduct = new ServiceProvider();
    }

    public IServiceProduct getServiceProduct() {
        return serviceProduct;
    }

    public View getView() {
        return view;
    }






}

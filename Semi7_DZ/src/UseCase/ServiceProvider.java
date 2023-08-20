package UseCase;

import ModelData.IRepo;

public class ServiceProvider implements IService {
    private IRepo model;

    public ServiceProvider(IRepo model) {
        this.model = model;
    }

    public ServiceProvider getService() {
        return this;
    }

    public ServiceOrder getServOrder(){
        return new ServiceOrder(model.getOrder());
    }

}

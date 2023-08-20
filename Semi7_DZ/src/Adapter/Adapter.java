package Adapter;

import UseCase.IService;

public class Adapter {

    private IService iService;
    private JSON json;

    public Adapter(IService iService) {
        this.iService = iService;
        this.json = new JSON();
    }

    public JSON sumOrder(){
       float sum = iService.getService().getServOrder().sumSale();
     return json.toSum(sum);

    }

}

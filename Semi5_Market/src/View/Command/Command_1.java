package View.Command;

import View.Service.PrintList;
import View.View;

public class Command_1 implements IOption {

    private View view;

    public Command_1(View view) {
        this.view = view;
    }

    public String info() {
        String text = "Список машин --> ";
        return text;
    }

    public void doit() {
        PrintList productList = new PrintList();
        productList.PrintProductList(view.getPresenter().getServiceProduct().getServiceCar().getCarList());
    }

    //        view.load(); //  или запустить команды прописанных в этом методе

}


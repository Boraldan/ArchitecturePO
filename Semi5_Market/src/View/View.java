package View;

import Domen.Products.ProductBike;
import Domen.Products.ProductCar;
import Presenter.Presenter;
import View.Command.Command_1;
import View.Command.IOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private Presenter presenter;

    private List<IOption> menuList;

    Scanner scan = new Scanner(System.in);

    public View(Presenter presenter) {
        this.presenter = presenter;
        this.menuList = new ArrayList<>();
        menuList.add(new Command_1(this));
//        menuList.add(new Comand2(this));
    }

    public Presenter getPresenter() {
        return presenter;
    }
    public void printMenu() {
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(i+1 + " - " + menuList.get(i).info());
        }
        System.out.println("Введите номер запроса: ");
        int num = scan.nextInt();
        menuList.get(num - 1).doit();
    }

    //    public void load(){
//    presenter.  ...... }  //  можно сюда ввести список дальнейших дествий

}

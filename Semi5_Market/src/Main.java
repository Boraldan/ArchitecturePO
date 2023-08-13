import Presenter.Presenter;
import View.View;

public class Main {
    public static void main(String[] args) {

        Presenter presenter = new Presenter();
        presenter.getView().printMenu();
    }
}

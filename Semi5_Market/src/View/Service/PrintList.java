package View.Service;

import java.util.List;

public class PrintList {
    public <E> void PrintProductList(List<E> list) {
        for (E el : list) {
            System.out.println(el);
        }
    }
}

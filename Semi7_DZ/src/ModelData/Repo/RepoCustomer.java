package ModelData.Repo;

import Domen.Customer;

import java.util.ArrayList;
import java.util.List;

public class RepoCustomer {

    private static RepoCustomer repoCustomer;
    private List<Customer> customer;

    private RepoCustomer() {
        //имитация работы базы клиентов
        customer = new ArrayList<>();
        customer.add(new Customer("Ivanov",  111, "SPb"));
        customer.add(new Customer("Petrov",  222, "Msw"));

    }

    public static RepoCustomer getCustomerRepo() {
        if (repoCustomer == null) {
            repoCustomer = new RepoCustomer();
        }
        return repoCustomer;
    }

    public List<Customer> getCustomer() {
        return customer;
    }
}

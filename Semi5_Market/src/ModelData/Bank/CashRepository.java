package ModelData.Bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс репозиторий для имитации работы с базой данных банка
 */
public class CashRepository {
    private static CashRepository cashRepository;
    private List<BankAccount> clients;

    private CashRepository() {
        //имитация работы банка
        clients = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            clients.add(new BankAccount());
        }
    }

    public static CashRepository getCashRepository() {
        if (cashRepository == null) {
            cashRepository = new CashRepository();
        }
        return cashRepository;
    }

    public List<BankAccount> getClients() {
        return clients;
    }

}

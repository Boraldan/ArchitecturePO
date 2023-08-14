package ModelData.Bank;

import Domen.Order;
import Domen.User;

import java.util.List;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {


    private long cardNumber;
    private boolean isAuthorized = false;

    private CashRepository cashRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.cashRepository = CashRepository.getCashRepository();
    }

    public CashRepository getCashRepository() {
        return cashRepository;
    }

    public boolean buy(Order order) throws RuntimeException {
        if (isAuthorized) {
            return transaction(order.getCart().getSum(), cardNumber, order.getSeller().getCardNumber());
        }
        return false;
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     * <p>
     *
     * @param user
     */
    public void authorization(User user) throws RuntimeException {
        for (BankAccount findCard : cashRepository.getClients()) {
            if (findCard.getCard() == user.getCardNumber()) {
                cardNumber = findCard.getCard();
                isAuthorized = true;
                return;
            }
        }
        throw new RuntimeException("A client with this CardNumber not found");
    }

    public boolean transaction(long payment, long cardFrom, long sellerСard) throws RuntimeException {
        // Проводим валидацию аккаунтов
        BankAccount from = null;
        BankAccount to = null;

        for (var client : cashRepository.getClients()) {
            if (client.getCard() == cardFrom) {
                from = client;
            }
            if (client.getCard() == sellerСard) {
                to = client;
            }
        }
        // Проверяем наличие банковских карт продавца и покупателя
        if (from == null) {
            throw new RuntimeException("No withdrawal account.");
        }
        if (to == null) {
            throw new RuntimeException("No money account.");
        }
        // Проверяем баланс средств на картах
        if (from.getBalance() - payment < 0) {
            throw new RuntimeException("Insufficient funds.");
        }
        if (to.getBalance() > Integer.MAX_VALUE - payment) {
            throw new RuntimeException("Too much amount.");
        }
        // Блок finally выполнится в любом случае, даже если произойдет исключение.
        // Помещая операции по переводу денег в блок finally, мы создаем дополнительную безопасность
        // проведения транзакции.
        try {
        } finally {
            cashRepository.getClients().remove(from);
            cashRepository.getClients().remove(to);
            from.setBalance(from.getBalance() - payment);
            to.setBalance(to.getBalance() + payment);
            cashRepository.getClients().add(from);
            cashRepository.getClients().add(to);
        }
        return true;
    }
}
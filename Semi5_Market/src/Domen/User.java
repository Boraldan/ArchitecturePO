package Domen;

import java.util.List;
import java.util.Objects;

/**
 * Модель пользователя
 */
public class User {
    private int id;
    private String userName;
    private int hashPassword;
    private long cardNumber;
    private static int idUserCounter;

    private List<Order> orderList;

    public User(String userName, int hashPassword, long cardNumber) {
        this.id = ++idUserCounter;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getHashPassword() {
        return hashPassword;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Client { " +
                "id= " + id +
                ", userName= " + userName +
                ", cardNumber= " + (String.format("%016d", cardNumber)) +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        User client = (User) o;
        return this.equals(client);
    }


    public boolean equals(User client) {
        return id == client.id && hashPassword == client.hashPassword && cardNumber == client.cardNumber && userName.equals(client.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, hashPassword, cardNumber);
    }
}

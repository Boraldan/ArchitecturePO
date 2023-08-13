package Service;

import Domen.User;
import ModelData.RepoUser;

import java.util.List;

public class ServiceUser implements IServiceUser {
    private List<User> userList;

    /**
     * Конструктор класса
     */
    public ServiceUser() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.userList = RepoUser.getClientRepository().getClients();
    }

    @Override
    public User create(String userName, int passwordHash, long cardNumber) throws RuntimeException {
        User client = new User(userName, passwordHash, cardNumber);
        for (var currentClient : userList) {
            if (currentClient.getId() == client.getId()) {
                throw new RuntimeException("A client already exists");
            }
        }
        RepoUser.getClientRepository().addUser(client);
        return client;
    }

    @Override
    public User findIdUser(int id) throws RuntimeException {
        for (var client : userList) {
            if (client.getId() == id) {
                return client;
            }
        }
        throw new RuntimeException("A client with this ID not found");
    }

    @Override
    public User findNameUser(String userName) throws RuntimeException {
        for (var client : userList) {
            var clientName = client.getUserName();
            if (clientName.equals(userName)) {
                return client;
            }
        }
        throw new RuntimeException("A client with this ID not found");
    }

    @Override
    public List<User> getUserList() throws RuntimeException {
        if (userList.isEmpty()) {
            throw new RuntimeException("List of clients is empty");
        }
        return userList;
    }

    @Override
    public boolean update(User client) {
        for (User currentClient : userList) {
            if (currentClient.getId() == client.getId()) {
                userList.remove(currentClient);
                userList.add(client);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(User client) {
        for (User currentClient : userList) {
            if (currentClient.equals(client)) {
                userList.remove(currentClient);
                return true;
            }
        }
        return false;
    }
}

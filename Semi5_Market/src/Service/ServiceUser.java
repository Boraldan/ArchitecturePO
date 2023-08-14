package Service;

import Domen.User;
import ModelData.RepoUser;

import java.util.List;

public class ServiceUser {
    private List<User> userList;
    private ServiceProvider serviceProvider;

    /**
     * Конструктор класса
     */
    public ServiceUser(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.userList = serviceProvider.getPresenter().getiRepo().getRepoUser().getClientRepository().getClients();
    }


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


    public User findIdUser(int id) throws RuntimeException {
        for (var client : userList) {
            if (client.getId() == id) {
                return client;
            }
        }
        throw new RuntimeException("A client with this ID not found");
    }


    public User findNameUser(String userName) throws RuntimeException {
        for (var client : userList) {
            var clientName = client.getUserName();
            if (clientName.equals(userName)) {
                return client;
            }
        }
        throw new RuntimeException("A client with this ID not found");
    }


    public List<User> getUserList() throws RuntimeException {
        if (userList.isEmpty()) {
            throw new RuntimeException("List of clients is empty");
        }
        return userList;
    }


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

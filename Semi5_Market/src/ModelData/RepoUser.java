package ModelData;

import Domen.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс репозиторий для имитации работы с базой данных
 */
public class RepoUser {
    private static RepoUser clientRepository;
    private List<User> clients;

    private RepoUser() {
        //имитация работы базы клиентов
        clients = new ArrayList<>();
        clients.add(new User("Ivan", "1111".hashCode(), 2));
        clients.add(new User("Vasiliy", "2222".hashCode(), 3));
        clients.add(new User("Fedor", "3333".hashCode(), 4));
        clients.add(new User("Grigoriy", "4444".hashCode(), 5));
    }

    public static RepoUser getClientRepository() {
        if (clientRepository == null) {
            clientRepository = new RepoUser();
        }
        return clientRepository;
    }

    public List<User> getClients() {
        return clients;
    }


    public boolean authorizationRepo(User user) {
        for (User findUser : clientRepository.getClients()) {
            if (findUser.getId() == user.getId()) {
                return true;
            }
        }
        return false;
    }

    public void addUser(User user) {
        clients.add(user);
    }

}

package Service;

import Domen.User;

import java.util.List;

public interface IServiceUser {
    User create(String userName, int passwordHash, long cardNumber);
    User findIdUser(int id);
    User findNameUser(String userName);
    List<User> getUserList();
    boolean update(User client);
    boolean delete(User client);

}

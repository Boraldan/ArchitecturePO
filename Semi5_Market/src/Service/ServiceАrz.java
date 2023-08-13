package Service;

import Domen.Cart;
import Domen.User;
import ModelData.RepoUser;

public class ServiceАrz {  // авторизация покупателя

    private Cart cartArz;
    private User user;
    private boolean аuthorization = false;

    public ServiceАrz(Cart cartArz, User user) {
        this.cartArz = cartArz;
        this.user = user;
    }

    public boolean authorization(User user) throws RuntimeException {
        boolean flag = RepoUser.getClientRepository().authorizationRepo(user);
        if (flag) {
            this.аuthorization = true;
            this.user = user;
        }
        throw new RuntimeException("A User not found");
    }

    public Cart getCartArz() {
        return cartArz;
    }

    public User getUser() {
        return user;
    }
}

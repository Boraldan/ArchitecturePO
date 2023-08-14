package Service;

import Domen.Cart;
import Domen.User;

public class ServiceАrz {  // авторизация покупателя

    private Cart cartArz;
    private User user;
    private boolean аuthorization = false;

    private ServiceProvider serviceProvider;

    public ServiceАrz(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public boolean authorization(User user) throws RuntimeException {
        boolean flag = serviceProvider.getPresenter().getiRepo().getRepoUser().getClientRepository().authorizationRepo(user);
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

    public boolean isАuthorization() {
        return аuthorization;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public void setCartArz(Cart cartArz) {
        this.cartArz = cartArz;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setАuthorization(boolean аuthorization) {
        this.аuthorization = аuthorization;
    }
}

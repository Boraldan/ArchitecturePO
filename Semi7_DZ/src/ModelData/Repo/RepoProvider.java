package ModelData.Repo;

import Domen.Provider;

import java.util.ArrayList;
import java.util.List;

public class RepoProvider {
    private static RepoProvider repoProvider;

    private List<Provider> provider;

    private RepoProvider() {
        this.provider = new ArrayList<>();
        provider.add(new Provider("Provider", "VlV",321, 183, 90));
    }

    public static RepoProvider getRepoProvider() {
        if (repoProvider == null) {
            repoProvider = new RepoProvider();
        }
        return repoProvider;
    }

    public  List<Provider> getProvider(){
    return provider;
    }


}

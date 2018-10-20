package me.vighnesh.api.yodlee;

import me.vighnesh.api.yodlee.dao.provider.Providers;
import me.vighnesh.api.yodlee.service.ProviderDAO;

public class Main {
    public static void main(String[] args) {
        //createUser();
        Providers providers = YodleeAPI.getProviders();
        ProviderDAO.save(providers);
        String query = ProviderDAO.query();
        System.out.println(query);
    }
}

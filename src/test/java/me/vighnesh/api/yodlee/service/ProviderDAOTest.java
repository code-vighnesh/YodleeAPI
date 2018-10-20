package me.vighnesh.api.yodlee.service;

import me.vighnesh.api.yodlee.YodleeAPI;
import me.vighnesh.api.yodlee.dao.provider.Provider;
import me.vighnesh.api.yodlee.dao.provider.Providers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProviderDAOTest {
    @Test
    public void save() {
        Providers providers = new Providers();

        Provider provider = new Provider();
        provider.setId(745);
        provider.setBaseUrl("https://vighnesh.me");
        provider.setCountryISOCode("IN");
        provider.setName("FI Bank");

        providers.setProvider(Arrays.asList(provider));
        ProviderDAO.save(providers);

    }

    @Test
    public void query() {
        String query = ProviderDAO.query();
        Assertions.assertNotNull(query, "query should not be null");
        Assertions.assertEquals("\"US\": 4500,\"IN\": 2", query, "query should match");
    }
}

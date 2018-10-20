package me.vighnesh.api.yodlee;

import me.vighnesh.api.yodlee.dao.provider.Provider;
import me.vighnesh.api.yodlee.dao.provider.Providers;
import me.vighnesh.api.yodlee.dao.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YodleeAPITest {

    @Test
    public void createUser() {
        User user = YodleeAPI.createUser();

    }


    @Test
    public void getProviders() {
        Providers providers = YodleeAPI.getProviders();
        Assertions.assertNotNull(providers, "providers should not be null");
        Assertions.assertNotNull(providers.getProvider(), "providers.getProvider() should not return null");

        Provider provider = providers.getProvider().get(0);
        Assertions.assertNotNull(provider, "provider should not be null");

        Assertions.assertEquals(Integer.valueOf(745), provider.getId(), "provider.getId() should match");
        Assertions.assertEquals("http://www.53.com/", provider.getBaseUrl(), "provider.getBaseUrl() should match");
        Assertions.assertEquals("US", provider.getCountryISOCode(), "provider.getCountryISOCode() should match");
        Assertions.assertEquals("Fifth Third Bank", provider.getName(), "provider.getName() should match");

    }
}

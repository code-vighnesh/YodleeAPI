package me.vighnesh.api.yodlee.support;

import io.vertx.rxjava.core.buffer.Buffer;
import io.vertx.rxjava.ext.web.client.HttpResponse;
import me.vighnesh.api.yodlee.dao.cobrand.Cobrand;
import me.vighnesh.api.yodlee.dao.user.UserCreationRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rx.Single;

public class UtilTest {
    @Test
    public void getCobrandLoginResponse() {
        Single<HttpResponse<Buffer>> cobrandLoginResponse = Util.getCobrandLoginResponse();
        Assertions.assertNotNull(cobrandLoginResponse, "cobrandLoginResponse should not be null");
        HttpResponse<Buffer> cobrand = cobrandLoginResponse.toBlocking().value();
        Assertions.assertNotNull(cobrand, "cobrand should not be null");
        String cobSession = cobrand.bodyAsJson(Cobrand.class).getSession().getCobSession();
        Assertions.assertNotNull(cobSession, "cobSession should not be null");
    }

    @Test
    public void getUserLoginResponse() {
        Single<HttpResponse<Buffer>> userLoginResponse = Util.getUserLoginResponse();
        Assertions.assertNotNull(userLoginResponse, "userLoginResponse should not be null");
        HttpResponse<Buffer> userLogin = userLoginResponse.toBlocking().value();
        Assertions.assertNotNull(userLogin, "userLogin should not be null");
        String userSession = userLogin.bodyAsJson(UserCreationRequest.class).getUser().getSession().getUserSession();
        Assertions.assertNotNull(userSession, "userSession should not be null");
    }
}

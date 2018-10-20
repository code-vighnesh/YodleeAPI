package me.vighnesh.api.yodlee;

import io.vertx.rxjava.core.MultiMap;
import io.vertx.rxjava.core.buffer.Buffer;
import io.vertx.rxjava.ext.web.client.HttpRequest;
import io.vertx.rxjava.ext.web.client.HttpResponse;
import io.vertx.rxjava.ext.web.client.WebClient;
import me.vighnesh.api.yodlee.dao.cobrand.Cobrand;
import me.vighnesh.api.yodlee.dao.provider.Providers;
import me.vighnesh.api.yodlee.dao.user.Name;
import me.vighnesh.api.yodlee.dao.user.User;
import me.vighnesh.api.yodlee.dao.user.UserCreationRequest;
import me.vighnesh.api.yodlee.support.Constants;
import me.vighnesh.api.yodlee.support.Util;
import me.vighnesh.api.yodlee.support.YodleeURL;
import rx.Single;


public class YodleeAPI {

    public static User createUser() {

        WebClient client = Util.getWebClient();
        HttpResponse<Buffer> corbrand = Util.getCobrandLoginResponse().toBlocking().value();
        String cobSession = corbrand.bodyAsJson(Cobrand.class).getSession().getCobSession();

        HttpResponse<Buffer> user = Util.getUserLoginResponse().toBlocking().value();
        if (user.statusCode() != 200) return null;
        String userSession = user.bodyAsJson(UserCreationRequest.class).getUser().getSession().getUserSession();

        HttpRequest<Buffer> request = client.postAbs(YodleeURL.HOST + YodleeURL.URI_CREATE_USER);

        MultiMap headers = request.headers();
        String authorization = Util.getAuthorizationHeader(cobSession, userSession);

        Util.setDefaultHeaders(headers, Constants.HEADER_AUTHORIZATION_NAME, authorization, Boolean.TRUE);

        User createUser = new User();

        Name name = new Name();

        name.setFirst("A");
        name.setLast("B");

        createUser.setName(name);
        createUser.setLoginName("AB1234567890");

        createUser.setEmail("test@test.com");
        createUser.setPassword("ABTest$123");

        UserCreationRequest userCreationRequest = new UserCreationRequest();
        userCreationRequest.setUser(createUser);

        Single<HttpResponse<Buffer>> httpResponseSingle = request.rxSendJson(userCreationRequest);
        HttpResponse<Buffer> value = httpResponseSingle.toBlocking().value();
        UserCreationRequest userCreationResponse = value.bodyAsJson(UserCreationRequest.class);
        System.out.println(userCreationResponse.getUser().getLoginName());
        return userCreationResponse.getUser();
    }

    public static Providers getProviders() {
        WebClient client = Util.getWebClient();

        HttpResponse<Buffer> corbrand = Util.getCobrandLoginResponse().toBlocking().value();
        String cobSession = corbrand.bodyAsJson(Cobrand.class).getSession().getCobSession();

        HttpResponse<Buffer> user = Util.getUserLoginResponse().toBlocking().value();
        String userSession = user.bodyAsJson(UserCreationRequest.class).getUser().getSession().getUserSession();

        HttpRequest<Buffer> request = client.getAbs(YodleeURL.HOST + YodleeURL.URI_PROVIDERS);

        MultiMap headers = request.headers();

        String authorization = Util.getAuthorizationHeader(cobSession, userSession);

        Util.setDefaultHeaders(headers, Constants.HEADER_AUTHORIZATION_NAME, authorization, Boolean.TRUE);

        Providers providers = request.addQueryParam("name", "FI Bank")
                .rxSend().toBlocking().value().bodyAsJson(Providers.class);
        return providers;
    }

}

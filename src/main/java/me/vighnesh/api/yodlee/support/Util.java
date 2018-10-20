package me.vighnesh.api.yodlee.support;

import io.vertx.rxjava.core.MultiMap;
import io.vertx.rxjava.core.Vertx;
import io.vertx.rxjava.core.buffer.Buffer;
import io.vertx.rxjava.ext.web.client.HttpRequest;
import io.vertx.rxjava.ext.web.client.HttpResponse;
import io.vertx.rxjava.ext.web.client.WebClient;
import me.vighnesh.api.yodlee.configuration.Configuration;
import me.vighnesh.api.yodlee.dao.cobrand.Cobrand;
import me.vighnesh.api.yodlee.dao.cobrand.CobrandRequest;
import me.vighnesh.api.yodlee.dao.user.User;
import me.vighnesh.api.yodlee.dao.user.UserCreationRequest;
import rx.Single;

public class Util {
    private static Configuration configuration = Configuration.getConfig();

    public static WebClient getWebClient() {
        Vertx vertx = Vertx.vertx();
        WebClient client = WebClient.create(vertx);
        return client;
    }

    public static String getAuthorizationHeader(String cobSession, String userSession) {
        return String.format("%s=%s,%s=%s", Constants.HEADER_COBSESSION, cobSession, Constants.HEADER_USERSESSION, userSession);
    }

    public static void setDefaultHeaders(MultiMap headers, String authHeader, String authorization, boolean isAuthHeaderRequired) {
        headers.set(Constants.HEADER_CONTENT_TYPE_NAME, Constants.HEADER_CONTENT_TYPE_VALUE);
        if (isAuthHeaderRequired)
            headers.set(authHeader, authorization);
        headers.set(Constants.HEADER_API_VERSION_NAME, Constants.HEADER_API_VERSION_VALUE);
        headers.set(Constants.HEADER_COBRAND_NAME_NAME, Constants.HEADER_COBRAND_NAME_VALUE);
        headers.set(Constants.HEADER_CACHE_CONTROL_NAME, Constants.HEADER_NO_CACHE_VALUE);
    }

    public static Single<HttpResponse<Buffer>> getCobrandLoginResponse() {
        WebClient client = getWebClient();

        HttpRequest<Buffer> request = client.postAbs(YodleeURL.HOST + YodleeURL.URI_COBRAND_LOGIN);

        MultiMap headers = request.headers();
        setDefaultHeaders(headers, null, null, Boolean.FALSE);

        Cobrand cobrand = new Cobrand();
        cobrand.setCobrandLogin(configuration.getSecrets().getCobrandSecrets().getCobrandLogin());
        cobrand.setCobrandPassword(configuration.getSecrets().getCobrandSecrets().getCobrandPassword());
        cobrand.setLocale("en_US");

        CobrandRequest cobrandRequest = new CobrandRequest();
        cobrandRequest.setCobrand(cobrand);
        cobrandRequest.setCobrand(cobrand);

        Single<HttpResponse<Buffer>> single = request.rxSendJson(cobrandRequest);
        return single;
    }


    public static Single<HttpResponse<Buffer>> getUserLoginResponse() {

        Single<HttpResponse<Buffer>> single = getCobrandLoginResponse();

        HttpResponse<Buffer> response = single.toBlocking().value();
        Cobrand cobSession = response.bodyAsJson(Cobrand.class);

        WebClient client = getWebClient();
        HttpRequest<Buffer> request = client.postAbs(YodleeURL.HOST + YodleeURL.URI_USER_LOGIN);

        MultiMap headers = request.headers();

        setDefaultHeaders(headers, Constants.HEADER_AUTHORIZATION_NAME, Constants.HEADER_COBSESSION + "=" + cobSession.getSession().getCobSession(), Boolean.TRUE);

        User user = new User();
        user.setLoginName(configuration.getSecrets().getUserSecrets().getLoginName());
        user.setPassword(configuration.getSecrets().getUserSecrets().getPassword());
        user.setLocale("en_US");

        UserCreationRequest userCreationRequest = new UserCreationRequest();
        userCreationRequest.setUser(user);

        return request.rxSendJson(userCreationRequest);
    }
}

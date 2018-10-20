package me.vighnesh.api.yodlee.dao.cobrand;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cobrand implements Serializable {

    @JsonProperty("cobrandId")
    private Integer cobrandId;
    @JsonProperty("applicationId")
    private String applicationId;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("session")
    private CobSession session;
    @JsonProperty("cobrandLogin")
    private String cobrandLogin;
    @JsonProperty("cobrandPassword")
    private String cobrandPassword;

    @JsonProperty("cobrandId")
    public Integer getCobrandId() {
        return cobrandId;
    }

    @JsonProperty("cobrandId")
    public void setCobrandId(Integer cobrandId) {
        this.cobrandId = cobrandId;
    }

    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("session")
    public CobSession getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(CobSession session) {
        this.session = session;
    }

    @JsonProperty("cobrandLogin")
    public String getCobrandLogin() {
        return cobrandLogin;
    }

    @JsonProperty("cobrandLogin")
    public void setCobrandLogin(String cobrandLogin) {
        this.cobrandLogin = cobrandLogin;
    }

    @JsonProperty("cobrandPassword")
    public String getCobrandPassword() {
        return cobrandPassword;
    }

    @JsonProperty("cobrandPassword")
    public void setCobrandPassword(String cobrandPassword) {
        this.cobrandPassword = cobrandPassword;
    }

}

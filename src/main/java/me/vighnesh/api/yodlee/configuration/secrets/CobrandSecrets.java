package me.vighnesh.api.yodlee.configuration.secrets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cobrandLogin",
        "cobrandPassword"
})
public class CobrandSecrets {

    @JsonProperty("cobrandLogin")
    private String cobrandLogin;
    @JsonProperty("cobrandPassword")
    private String cobrandPassword;

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
package me.vighnesh.api.yodlee.configuration.secrets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "loginName",
        "password"
})
public class UserSecrets {

    @JsonProperty("loginName")
    private String loginName;
    @JsonProperty("password")
    private String password;

    @JsonProperty("loginName")
    public String getLoginName() {
        return loginName;
    }

    @JsonProperty("loginName")
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

}
package me.vighnesh.api.yodlee.dao.cobrand;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "userSession"
})
public class Session {

    @JsonProperty("userSession")
    private String userSession;

    @JsonProperty("userSession")
    public String getUserSession() {
        return userSession;
    }

    @JsonProperty("userSession")
    public void setUserSession(String userSession) {
        this.userSession = userSession;
    }

}
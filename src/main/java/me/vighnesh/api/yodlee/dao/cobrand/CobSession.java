package me.vighnesh.api.yodlee.dao.cobrand;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cobSession"
})

public class CobSession {

    @JsonProperty("cobSession")
    private String cobSession;

    @JsonProperty("cobSession")
    public String getCobSession() {
        return cobSession;
    }

    @JsonProperty("cobSession")
    public void setCobSession(String cobSession) {
        this.cobSession = cobSession;
    }

}
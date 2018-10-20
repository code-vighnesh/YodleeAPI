package me.vighnesh.api.yodlee.dao.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "provider"
})
public class Providers {

    @JsonProperty("provider")
    private List<Provider> provider = null;

    @JsonProperty("provider")
    public List<Provider> getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(List<Provider> provider) {
        this.provider = provider;
    }

}
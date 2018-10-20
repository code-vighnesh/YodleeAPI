package me.vighnesh.api.yodlee.dao.cobrand;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CobrandRequest {

    @JsonProperty("cobrand")
    private Cobrand cobrand;

    @JsonProperty("cobrand")
    public Cobrand getCobrand() {
        return cobrand;
    }

    @JsonProperty("cobrand")
    public void setCobrand(Cobrand cobrand) {
        this.cobrand = cobrand;
    }
}

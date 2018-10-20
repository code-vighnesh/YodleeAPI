package me.vighnesh.api.yodlee.dao.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "numberOfTransactionDays"
})
public class BANK {

    @JsonProperty("numberOfTransactionDays")
    private Integer numberOfTransactionDays;

    @JsonProperty("numberOfTransactionDays")
    public Integer getNumberOfTransactionDays() {
        return numberOfTransactionDays;
    }

    @JsonProperty("numberOfTransactionDays")
    public void setNumberOfTransactionDays(Integer numberOfTransactionDays) {
        this.numberOfTransactionDays = numberOfTransactionDays;
    }

}
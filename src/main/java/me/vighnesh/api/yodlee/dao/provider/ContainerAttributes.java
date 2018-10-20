package me.vighnesh.api.yodlee.dao.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CREDITCARD",
        "BANK",
        "LOAN",
        "INVESTMENT"
})
public class ContainerAttributes {

    @JsonProperty("CREDITCARD")
    private CREDITCARD cREDITCARD;
    @JsonProperty("BANK")
    private BANK bANK;
    @JsonProperty("LOAN")
    private LOAN lOAN;
    @JsonProperty("INVESTMENT")
    private INVESTMENT iNVESTMENT;

    @JsonProperty("CREDITCARD")
    public CREDITCARD getCREDITCARD() {
        return cREDITCARD;
    }

    @JsonProperty("CREDITCARD")
    public void setCREDITCARD(CREDITCARD cREDITCARD) {
        this.cREDITCARD = cREDITCARD;
    }

    @JsonProperty("BANK")
    public BANK getBANK() {
        return bANK;
    }

    @JsonProperty("BANK")
    public void setBANK(BANK bANK) {
        this.bANK = bANK;
    }

    @JsonProperty("LOAN")
    public LOAN getLOAN() {
        return lOAN;
    }

    @JsonProperty("LOAN")
    public void setLOAN(LOAN lOAN) {
        this.lOAN = lOAN;
    }

    @JsonProperty("INVESTMENT")
    public INVESTMENT getINVESTMENT() {
        return iNVESTMENT;
    }

    @JsonProperty("INVESTMENT")
    public void setINVESTMENT(INVESTMENT iNVESTMENT) {
        this.iNVESTMENT = iNVESTMENT;
    }

}
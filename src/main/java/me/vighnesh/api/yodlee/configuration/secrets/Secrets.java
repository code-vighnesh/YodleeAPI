package me.vighnesh.api.yodlee.configuration.secrets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cobrandSecrets",
        "userSecrets",
        "databaseSecrets"
})
public class Secrets {

    @JsonProperty("cobrandSecrets")
    private CobrandSecrets cobrandSecrets;
    @JsonProperty("userSecrets")
    private UserSecrets userSecrets;
    @JsonProperty("databaseSecrets")
    private DatabaseSecrets databaseSecrets;

    @JsonProperty("cobrandSecrets")
    public CobrandSecrets getCobrandSecrets() {
        return cobrandSecrets;
    }

    @JsonProperty("cobrandSecrets")
    public void setCobrandSecrets(CobrandSecrets cobrandSecrets) {
        this.cobrandSecrets = cobrandSecrets;
    }

    @JsonProperty("userSecrets")
    public UserSecrets getUserSecrets() {
        return userSecrets;
    }

    @JsonProperty("userSecrets")
    public void setUserSecrets(UserSecrets userSecrets) {
        this.userSecrets = userSecrets;
    }

    @JsonProperty("databaseSecrets")
    public DatabaseSecrets getDatabaseSecrets() {
        return databaseSecrets;
    }

    @JsonProperty("databaseSecrets")
    public void setDatabaseSecrets(DatabaseSecrets databaseSecrets) {
        this.databaseSecrets = databaseSecrets;
    }

}

package me.vighnesh.api.yodlee.configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.vighnesh.api.yodlee.configuration.secrets.Secrets;

import java.io.IOException;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "secrets"
})
public class Configuration {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static Configuration configuration;

    static {
        try {
            configuration = mapper.readValue(Configuration.class.getResourceAsStream("config.json"), Configuration.class);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read configuration", e);
        }
    }

    public static Configuration getConfig() {
        return configuration;
    }

    @JsonProperty("secrets")
    private Secrets secrets;

    @JsonProperty("secrets")
    public Secrets getSecrets() {
        return secrets;
    }

    @JsonProperty("secrets")
    public void setSecrets(Secrets secrets) {
        this.secrets = secrets;
    }

}
package me.vighnesh.api.yodlee.dao.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "container"
})
public class Capability {

    @JsonProperty("name")
    private String name;
    @JsonProperty("container")
    private List<String> container = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("container")
    public List<String> getContainer() {
        return container;
    }

    @JsonProperty("container")
    public void setContainer(List<String> container) {
        this.container = container;
    }

}
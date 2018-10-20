package me.vighnesh.api.yodlee.dao.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "attribute"
})
public class Dataset {

    @JsonProperty("name")
    private String name;
    @JsonProperty("attribute")
    private List<Attribute> attribute = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("attribute")
    public List<Attribute> getAttribute() {
        return attribute;
    }

    @JsonProperty("attribute")
    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

}
package me.vighnesh.api.yodlee.dao.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import me.vighnesh.api.yodlee.dao.cobrand.Session;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "session",
        "loginName",
        "password",
        "email",
        "roleType",
        "name",
        "address",
        "preferences",
        "locale"
})
public class User {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("session")
    private Session session;
    @JsonProperty("loginName")
    private String loginName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("email")
    private String email;
    @JsonProperty("name")
    private Name name;
    @JsonIgnore
    @JsonProperty("roleType")
    private String roleType;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("preferences")
    private Preferences preferences;
    @JsonProperty("locale")
    private String locale;

    @JsonProperty("loginName")
    public String getLoginName() {
        return loginName;
    }

    @JsonProperty("loginName")
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @JsonProperty("session")
    public Session getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(Session session) {
        this.session = session;
    }


    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("roleType")
    public String getRoleType() {
        return roleType;
    }

    @JsonProperty("roleType")
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("preferences")
    public Preferences getPreferences() {
        return preferences;
    }

    @JsonProperty("preferences")
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

}
package me.vighnesh.api.yodlee.dao.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PRIORITY",
        "id",
        "name",
        "loginUrl",
        "baseUrl",
        "favicon",
        "logo",
        "status",
        "help",
        "authType",
        "languageISOCode",
        "primaryLanguageISOCode",
        "countryISOCode",
        "lastModified",
        "forgetPasswordUrl",
        "isAutoRefreshEnabled",
        "capability",
        "dataset",
        "isAddedByUser"
})
public class Provider {

    @JsonProperty("PRIORITY")
    private String pRIORITY;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("loginUrl")
    private String loginUrl;
    @JsonProperty("baseUrl")
    private String baseUrl;
    @JsonProperty("favicon")
    private String favicon;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("status")
    private String status;
    @JsonProperty("help")
    private String help;
    @JsonProperty("authType")
    private String authType;
    @JsonProperty("languageISOCode")
    private String languageISOCode;
    @JsonProperty("primaryLanguageISOCode")
    private String primaryLanguageISOCode;
    @JsonProperty("countryISOCode")
    private String countryISOCode;
    @JsonProperty("lastModified")
    private String lastModified;
    @JsonProperty("forgetPasswordUrl")
    private String forgetPasswordUrl;
    @JsonProperty("isAutoRefreshEnabled")
    private Boolean isAutoRefreshEnabled;
    @JsonProperty("capability")
    private List<Capability> capability = null;
    @JsonProperty("dataset")
    private List<Dataset> dataset = null;
    @JsonProperty("isAddedByUser")
    private String isAddedByUser;

    @JsonProperty("PRIORITY")
    public String getPRIORITY() {
        return pRIORITY;
    }

    @JsonProperty("PRIORITY")
    public void setPRIORITY(String pRIORITY) {
        this.pRIORITY = pRIORITY;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("loginUrl")
    public String getLoginUrl() {
        return loginUrl;
    }

    @JsonProperty("loginUrl")
    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("baseUrl")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonProperty("favicon")
    public String getFavicon() {
        return favicon;
    }

    @JsonProperty("favicon")
    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("help")
    public String getHelp() {
        return help;
    }

    @JsonProperty("help")
    public void setHelp(String help) {
        this.help = help;
    }

    @JsonProperty("authType")
    public String getAuthType() {
        return authType;
    }

    @JsonProperty("authType")
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    @JsonProperty("languageISOCode")
    public String getLanguageISOCode() {
        return languageISOCode;
    }

    @JsonProperty("languageISOCode")
    public void setLanguageISOCode(String languageISOCode) {
        this.languageISOCode = languageISOCode;
    }

    @JsonProperty("primaryLanguageISOCode")
    public String getPrimaryLanguageISOCode() {
        return primaryLanguageISOCode;
    }

    @JsonProperty("primaryLanguageISOCode")
    public void setPrimaryLanguageISOCode(String primaryLanguageISOCode) {
        this.primaryLanguageISOCode = primaryLanguageISOCode;
    }

    @JsonProperty("countryISOCode")
    public String getCountryISOCode() {
        return countryISOCode;
    }

    @JsonProperty("countryISOCode")
    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("forgetPasswordUrl")
    public String getForgetPasswordUrl() {
        return forgetPasswordUrl;
    }

    @JsonProperty("forgetPasswordUrl")
    public void setForgetPasswordUrl(String forgetPasswordUrl) {
        this.forgetPasswordUrl = forgetPasswordUrl;
    }

    @JsonProperty("isAutoRefreshEnabled")
    public Boolean getIsAutoRefreshEnabled() {
        return isAutoRefreshEnabled;
    }

    @JsonProperty("isAutoRefreshEnabled")
    public void setIsAutoRefreshEnabled(Boolean isAutoRefreshEnabled) {
        this.isAutoRefreshEnabled = isAutoRefreshEnabled;
    }

    @JsonProperty("capability")
    public List<Capability> getCapability() {
        return capability;
    }

    @JsonProperty("capability")
    public void setCapability(List<Capability> capability) {
        this.capability = capability;
    }

    @JsonProperty("dataset")
    public List<Dataset> getDataset() {
        return dataset;
    }

    @JsonProperty("dataset")
    public void setDataset(List<Dataset> dataset) {
        this.dataset = dataset;
    }

    @JsonProperty("isAddedByUser")
    public String getIsAddedByUser() {
        return isAddedByUser;
    }

    @JsonProperty("isAddedByUser")
    public void setIsAddedByUser(String isAddedByUser) {
        this.isAddedByUser = isAddedByUser;
    }

}
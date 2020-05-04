
package com.orangedusk.mytemplate.covid.vo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "active",
    "confirmed",
    "deaths",
    "deltaconfirmed",
    "deltadeaths",
    "deltarecovered",
    "lastupdatedtime",
    "recovered",
    "state",
    "statecode",
    "statenotes"
})
public class Statewise {

    @JsonProperty("active")
    private String active;
    @JsonProperty("confirmed")
    private String confirmed;
    @JsonProperty("deaths")
    private String deaths;
    @JsonProperty("deltaconfirmed")
    private String deltaconfirmed;
    @JsonProperty("deltadeaths")
    private String deltadeaths;
    @JsonProperty("deltarecovered")
    private String deltarecovered;
    @JsonProperty("lastupdatedtime")
    private String lastupdatedtime;
    @JsonProperty("recovered")
    private String recovered;
    @JsonProperty("state")
    private String state;
    @JsonProperty("statecode")
    private String statecode;
    @JsonProperty("statenotes")
    private String statenotes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("confirmed")
    public String getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("deaths")
    public String getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("deltaconfirmed")
    public String getDeltaconfirmed() {
        return deltaconfirmed;
    }

    @JsonProperty("deltaconfirmed")
    public void setDeltaconfirmed(String deltaconfirmed) {
        this.deltaconfirmed = deltaconfirmed;
    }

    @JsonProperty("deltadeaths")
    public String getDeltadeaths() {
        return deltadeaths;
    }

    @JsonProperty("deltadeaths")
    public void setDeltadeaths(String deltadeaths) {
        this.deltadeaths = deltadeaths;
    }

    @JsonProperty("deltarecovered")
    public String getDeltarecovered() {
        return deltarecovered;
    }

    @JsonProperty("deltarecovered")
    public void setDeltarecovered(String deltarecovered) {
        this.deltarecovered = deltarecovered;
    }

    @JsonProperty("lastupdatedtime")
    public String getLastupdatedtime() {
        return lastupdatedtime;
    }

    @JsonProperty("lastupdatedtime")
    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    @JsonProperty("recovered")
    public String getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("statecode")
    public String getStatecode() {
        return statecode;
    }

    @JsonProperty("statecode")
    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    @JsonProperty("statenotes")
    public String getStatenotes() {
        return statenotes;
    }

    @JsonProperty("statenotes")
    public void setStatenotes(String statenotes) {
        this.statenotes = statenotes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


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
    "dailyconfirmed",
    "dailydeceased",
    "dailyrecovered",
    "date",
    "totalconfirmed",
    "totaldeceased",
    "totalrecovered"
})
public class CasesTimeSeries {

    @JsonProperty("dailyconfirmed")
    private String dailyconfirmed;
    @JsonProperty("dailydeceased")
    private String dailydeceased;
    @JsonProperty("dailyrecovered")
    private String dailyrecovered;
    @JsonProperty("date")
    private String date;
    @JsonProperty("totalconfirmed")
    private String totalconfirmed;
    @JsonProperty("totaldeceased")
    private String totaldeceased;
    @JsonProperty("totalrecovered")
    private String totalrecovered;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dailyconfirmed")
    public String getDailyconfirmed() {
        return dailyconfirmed;
    }

    @JsonProperty("dailyconfirmed")
    public void setDailyconfirmed(String dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    @JsonProperty("dailydeceased")
    public String getDailydeceased() {
        return dailydeceased;
    }

    @JsonProperty("dailydeceased")
    public void setDailydeceased(String dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    @JsonProperty("dailyrecovered")
    public String getDailyrecovered() {
        return dailyrecovered;
    }

    @JsonProperty("dailyrecovered")
    public void setDailyrecovered(String dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("totalconfirmed")
    public String getTotalconfirmed() {
        return totalconfirmed;
    }

    @JsonProperty("totalconfirmed")
    public void setTotalconfirmed(String totalconfirmed) {
        this.totalconfirmed = totalconfirmed;
    }

    @JsonProperty("totaldeceased")
    public String getTotaldeceased() {
        return totaldeceased;
    }

    @JsonProperty("totaldeceased")
    public void setTotaldeceased(String totaldeceased) {
        this.totaldeceased = totaldeceased;
    }

    @JsonProperty("totalrecovered")
    public String getTotalrecovered() {
        return totalrecovered;
    }

    @JsonProperty("totalrecovered")
    public void setTotalrecovered(String totalrecovered) {
        this.totalrecovered = totalrecovered;
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

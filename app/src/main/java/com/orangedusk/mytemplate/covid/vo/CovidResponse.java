
package com.orangedusk.mytemplate.covid.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cases_time_series",
    "statewise",
    "tested"
})
public class CovidResponse {

    @JsonProperty("cases_time_series")
    private List<CasesTimeSeries> casesTimeSeries = null;
    @JsonProperty("statewise")
    private List<Statewise> statewise = null;
    @JsonProperty("tested")
    private List<Tested> tested = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cases_time_series")
    public List<CasesTimeSeries> getCasesTimeSeries() {
        return casesTimeSeries;
    }

    @JsonProperty("cases_time_series")
    public void setCasesTimeSeries(List<CasesTimeSeries> casesTimeSeries) {
        this.casesTimeSeries = casesTimeSeries;
    }

    @JsonProperty("statewise")
    public List<Statewise> getStatewise() {
        return statewise;
    }

    @JsonProperty("statewise")
    public void setStatewise(List<Statewise> statewise) {
        this.statewise = statewise;
    }

    @JsonProperty("tested")
    public List<Tested> getTested() {
        return tested;
    }

    @JsonProperty("tested")
    public void setTested(List<Tested> tested) {
        this.tested = tested;
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


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
    "individualstestedperconfirmedcase",
    "positivecasesfromsamplesreported",
    "samplereportedtoday",
    "source",
    "testpositivityrate",
    "testsconductedbyprivatelabs",
    "testsperconfirmedcase",
    "totalindividualstested",
    "totalpositivecases",
    "totalsamplestested",
    "updatetimestamp"
})
public class Tested {

    @JsonProperty("individualstestedperconfirmedcase")
    private String individualstestedperconfirmedcase;
    @JsonProperty("positivecasesfromsamplesreported")
    private String positivecasesfromsamplesreported;
    @JsonProperty("samplereportedtoday")
    private String samplereportedtoday;
    @JsonProperty("source")
    private String source;
    @JsonProperty("testpositivityrate")
    private String testpositivityrate;
    @JsonProperty("testsconductedbyprivatelabs")
    private String testsconductedbyprivatelabs;
    @JsonProperty("testsperconfirmedcase")
    private String testsperconfirmedcase;
    @JsonProperty("totalindividualstested")
    private String totalindividualstested;
    @JsonProperty("totalpositivecases")
    private String totalpositivecases;
    @JsonProperty("totalsamplestested")
    private String totalsamplestested;
    @JsonProperty("updatetimestamp")
    private String updatetimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("individualstestedperconfirmedcase")
    public String getIndividualstestedperconfirmedcase() {
        return individualstestedperconfirmedcase;
    }

    @JsonProperty("individualstestedperconfirmedcase")
    public void setIndividualstestedperconfirmedcase(String individualstestedperconfirmedcase) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
    }

    @JsonProperty("positivecasesfromsamplesreported")
    public String getPositivecasesfromsamplesreported() {
        return positivecasesfromsamplesreported;
    }

    @JsonProperty("positivecasesfromsamplesreported")
    public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
    }

    @JsonProperty("samplereportedtoday")
    public String getSamplereportedtoday() {
        return samplereportedtoday;
    }

    @JsonProperty("samplereportedtoday")
    public void setSamplereportedtoday(String samplereportedtoday) {
        this.samplereportedtoday = samplereportedtoday;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("testpositivityrate")
    public String getTestpositivityrate() {
        return testpositivityrate;
    }

    @JsonProperty("testpositivityrate")
    public void setTestpositivityrate(String testpositivityrate) {
        this.testpositivityrate = testpositivityrate;
    }

    @JsonProperty("testsconductedbyprivatelabs")
    public String getTestsconductedbyprivatelabs() {
        return testsconductedbyprivatelabs;
    }

    @JsonProperty("testsconductedbyprivatelabs")
    public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
    }

    @JsonProperty("testsperconfirmedcase")
    public String getTestsperconfirmedcase() {
        return testsperconfirmedcase;
    }

    @JsonProperty("testsperconfirmedcase")
    public void setTestsperconfirmedcase(String testsperconfirmedcase) {
        this.testsperconfirmedcase = testsperconfirmedcase;
    }

    @JsonProperty("totalindividualstested")
    public String getTotalindividualstested() {
        return totalindividualstested;
    }

    @JsonProperty("totalindividualstested")
    public void setTotalindividualstested(String totalindividualstested) {
        this.totalindividualstested = totalindividualstested;
    }

    @JsonProperty("totalpositivecases")
    public String getTotalpositivecases() {
        return totalpositivecases;
    }

    @JsonProperty("totalpositivecases")
    public void setTotalpositivecases(String totalpositivecases) {
        this.totalpositivecases = totalpositivecases;
    }

    @JsonProperty("totalsamplestested")
    public String getTotalsamplestested() {
        return totalsamplestested;
    }

    @JsonProperty("totalsamplestested")
    public void setTotalsamplestested(String totalsamplestested) {
        this.totalsamplestested = totalsamplestested;
    }

    @JsonProperty("updatetimestamp")
    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    @JsonProperty("updatetimestamp")
    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
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

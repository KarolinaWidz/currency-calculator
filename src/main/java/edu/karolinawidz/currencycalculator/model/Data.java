package edu.karolinawidz.currencycalculator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    @JsonProperty(value ="USD")
    BigDecimal usd;
    @JsonProperty(value = "SEK")
    BigDecimal sek;
    @JsonProperty(value = "PLN")
    BigDecimal pln;
    @JsonProperty(value = "GBP")
    BigDecimal gbp;

    Data() {
    }

    BigDecimal getUsd() {
        return usd;
    }

    void setUsd(BigDecimal usd) {
        this.usd = usd;
    }

    BigDecimal getSek() {
        return sek;
    }

    void setSek(BigDecimal sek) {
        this.sek = sek;
    }

    BigDecimal getPln() {
        return pln;
    }

    void setPln(BigDecimal pln) {
        this.pln = pln;
    }

    BigDecimal getGbp() {
        return gbp;
    }

    void setGbp(BigDecimal gbp) {
        this.gbp = gbp;
    }

    @Override
    public String toString() {
        return "Data{" +
                "USD=" + usd +
                ", SEK=" + sek +
                ", PLN=" + pln +
                ", GBP=" + gbp +
                '}';
    }
}

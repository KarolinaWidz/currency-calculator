package edu.karolinawidz.currencycalculator.rates.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    @JsonProperty(value = "data")
    private Map<CurrencyName, BigDecimal> data;

    public Rate() {
    }

    Map<CurrencyName, BigDecimal> getData() {
        return data;
    }

    void setData(Map<CurrencyName, BigDecimal> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "data=" + data +
                '}';
    }
}

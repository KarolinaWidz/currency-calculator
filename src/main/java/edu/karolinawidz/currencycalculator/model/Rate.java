package edu.karolinawidz.currencycalculator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    private Data data;

    public Rate() {
    }

    Data getData() {
        return data;
    }

    void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Rates{" +
                "data=" + data +
                '}';
    }
}

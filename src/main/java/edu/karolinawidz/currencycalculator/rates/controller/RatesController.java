package edu.karolinawidz.currencycalculator.rates.controller;

import edu.karolinawidz.currencycalculator.rates.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/currencies")
class RatesController {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{base}")
    public ResponseEntity<String> getRates(@PathVariable("base") String baseName) {
        Rate rate = restTemplate.getForObject("https://freecurrencyapi.net/api/v2/latest?apikey=" + apiKey + "&base_currency=" + baseName, Rate.class);
        return ResponseEntity.ok(rate.toString());
    }

}

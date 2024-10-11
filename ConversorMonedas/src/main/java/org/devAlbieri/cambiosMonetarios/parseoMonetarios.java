package org.devAlbieri.cambiosMonetarios;

import java.util.Map;
import java.util.Set;

public record parseoMonetarios(Map<String,Double> conversion_rates) {
    public Map<String, Double> conversion_rates() {
        return conversion_rates;
    }
}

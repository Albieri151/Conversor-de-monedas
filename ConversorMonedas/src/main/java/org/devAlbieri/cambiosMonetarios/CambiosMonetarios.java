package org.devAlbieri.cambiosMonetarios;

import java.util.Map;
import java.util.Set;

public class CambiosMonetarios {

    Map cambiosMonetarios;

    public CambiosMonetarios(parseoMonetarios cambiosMonetarios) {
        this.cambiosMonetarios = cambiosMonetarios.conversion_rates();
    }

    public Double getCambioMonetario(String monedaComparada) {
        return (Double) cambiosMonetarios.get(monedaComparada);
    }
}

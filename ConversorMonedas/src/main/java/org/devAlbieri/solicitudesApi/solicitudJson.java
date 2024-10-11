package org.devAlbieri.solicitudesApi;

import com.google.gson.Gson;
import org.devAlbieri.cambiosMonetarios.CambiosMonetarios;
import org.devAlbieri.cambiosMonetarios.parseoMonetarios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class solicitudJson {

    public static void Consulta(String moneda, String cambio) {

        try {
            String apiKey = "ba4588322db6d9f0abd116b2";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", apiKey, moneda))).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            parseoMonetarios parseoJson = (parseoMonetarios) gson.fromJson((String) response.body(), parseoMonetarios.class);
            CambiosMonetarios CambioMoneda = new CambiosMonetarios(parseoJson);
            System.out.println(String.format("""
                                              Su moneda es: (%s)
                                              Su consulta es: (%s) y tiene un valor respectivo de:%f
                                              """,moneda,cambio,CambioMoneda.getCambioMonetario(cambio)));

        } catch (IOException | InterruptedException e) {
            System.out.println("Excepcion recibida del tipo: " + e);
        }

    }

    ;

}

package br.com.conversorMoedas.api;

import br.com.conversorMoedas.model.ExchangeRate;
import br.com.conversorMoedas.util.JSONParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    private static final String URL_API = "https://v6.exchangerate-api.com/v6/";
    private static final String KEY_API = "7f38db59f6890923946e2cd5";

    public ExchangeRate getExchangeRate(String buscaMoeda) throws IOException, InterruptedException {
        String urlString = URL_API + KEY_API + "/latest/" + buscaMoeda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String json = response.body();
            return JSONParser.parseExchangeRate(json);
        } else {
            throw new IOException("Failed to get exchange rate data. Response Code: " + response.statusCode());
        }
    }
}

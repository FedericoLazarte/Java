package service;

import model.MonedaRecord;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MonedaService {
	private static final String API_KEY = System.getenv("API_KEY_EXCHANGE_RATE");
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public MonedaRecord getConversionRate(String monedaInicial, String monedaAConvertir) throws IOException, InterruptedException {
        String url = API_URL + monedaInicial + "/" + monedaAConvertir;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting().create();

        return gson.fromJson(response.body(), MonedaRecord.class);
    }
}
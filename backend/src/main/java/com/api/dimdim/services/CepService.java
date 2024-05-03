package com.api.dimdim.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class CepService {
    public static String consultarCep(String cep) throws Exception {
        var uri = URI.create("https://viacep.com.br/ws/" + cep + "/json");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body(); // Return the raw JSON response
    }
}

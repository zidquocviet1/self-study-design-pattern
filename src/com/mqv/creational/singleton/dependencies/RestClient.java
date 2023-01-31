package com.mqv.creational.singleton.dependencies;

import com.mqv.creational.singleton.model.IceCandidate;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public final class RestClient {
    private final HttpClient httpClient;
    private final String url;
    private final String token;

    RestClient(String url, String token) {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(30))
                .version(HttpClient.Version.HTTP_2)
                .build();
        this.url = url;
        this.token = token;
    }

    public IceCandidate fetchRemoteCandidate(String userId) {
        return new IceCandidate("172.16.39.158", "5005", "TCP");
    }

    public void sendRequest(HttpRequest request) throws IOException, InterruptedException {
        this.httpClient.send(request, HttpResponse.BodyHandlers.discarding());
    }
}

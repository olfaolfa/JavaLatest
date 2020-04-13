package org.id.modernjava.javaimprovements;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Java11AsyncHttpClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HttpClient httpClient=
                HttpClient.newBuilder().build();
        HttpRequest httpRequest=
                HttpRequest.newBuilder(URI.create("https://www.ldapsoft.com")).build();
        CompletableFuture<Void> httpResponse=
                httpClient.sendAsync(httpRequest,
                        HttpResponse.BodyHandlers.ofString()).thenAccept(HttpResponse::body).thenAccept(System.out::println);
        System.out.println("httpResponse.get() = " + httpResponse.get());
    }
}

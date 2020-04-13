package org.id.modernjava.javaimprovements;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11HttpClientExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient= HttpClient.newHttpClient();
        HttpRequest httpRequest=
                HttpRequest.newBuilder().uri(URI.create(
                        "https://www.ldapsoft.com")).build();
        HttpResponse<String> httpResponse=
                httpClient.send(httpRequest,
                        HttpResponse.BodyHandlers.ofString());
        System.out.println("httpResponse  = " + httpResponse);
        System.out.println("httpResponse body  = " + httpResponse.body());
    }
}

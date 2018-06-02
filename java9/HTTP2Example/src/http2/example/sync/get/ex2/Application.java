package http2.example.sync.get.ex2;

import http2.example.ProcessResponse;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Application {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder(new URI("http://www.forttiori.com/"))
                .GET()
                .build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandler.asString());
        ProcessResponse.processResponse(response);
    }
}

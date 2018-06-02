package http2.example.async.ex1;

import http2.example.ProcessResponse;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Application {

    public static void main(String[] args) throws URISyntaxException, InterruptedException, ExecutionException {
        HttpClient client = HttpClient.newHttpClient();
        CompletableFuture<HttpResponse<String>> compFuture = client.sendAsync(
                HttpRequest
                        .newBuilder(new URI("http://google.com"))
                        .GET()
                        .build(),
                HttpResponse.BodyHandler.asString());
        System.out.println("Async request has been made...");

        while (!compFuture.isDone()) {
            System.out.println("Do something else while we wait...");
        }

        System.out.println("Async request is done...");
        ProcessResponse.processResponse(compFuture.get());
    }
}

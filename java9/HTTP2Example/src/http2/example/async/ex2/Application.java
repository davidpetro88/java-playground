package http2.example.async.ex2;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        CompletableFuture<HttpResponse<String>> compFuture = client.sendAsync(
                HttpRequest
                        .newBuilder(new URI("https://davidpetro88.github.io/java-playground/java9/AsyncBook.csv"))
                        .GET()
                        .build(),
                HttpResponse.BodyHandler.asString())
                .whenComplete((r,t) -> System.out.println(r.body()));
        while (!compFuture.isDone()) { }
    }
}

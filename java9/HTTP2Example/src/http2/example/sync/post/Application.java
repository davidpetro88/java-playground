package http2.example.sync.post;

import http2.example.ProcessResponse;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse response = client.send(
                HttpRequest.newBuilder(new URI("http://google.com"))
                        .headers("Foo", "foovalue", "Bar", "barValue")
                        .POST(HttpRequest.BodyProcessor.fromString("Some string"))
                        .build(),
                HttpResponse.BodyHandler.asFile(Paths.get("FILE_POST.txt")));

        ProcessResponse.processResponse(response);
    }
}

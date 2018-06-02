package http2.example;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        String url = "http://www.google.com/";
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
        HttpResponse response = httpClient.send(request, HttpResponse.BodyHandler.asString());

        System.out.println("Headers ...");
        Map<String, List<String>> map = response.headers().map();
        map.forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println("\n Body ...");
        System.out.println(response.body());

    }
}

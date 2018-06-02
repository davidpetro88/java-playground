package http2.example;

import jdk.incubator.http.HttpHeaders;
import jdk.incubator.http.HttpResponse;

import java.util.List;
import java.util.Map;

public class ProcessResponse {
    public static void processResponse(HttpResponse response) {
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Headers:");

        HttpHeaders headers = response.headers();
        Map<String, List<String>> headerList = headers.map();
        headerList.forEach((k, v) -> System.out.println("\t" + k + ":" + v));

        System.out.println(response.body());
    }
}

package impl;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

public class Redirect {

	public static void main(String[] args) throws Exception {

		String body = HttpClient.newBuilder()
				.followRedirects(HttpClient.Redirect.SECURE)
				.version(HttpClient.Version.HTTP_2)
				.build()
				.send(HttpRequest.newBuilder()
								.uri(new URI("https://google.com/"))
								.GET()
								.build(),
						HttpResponse.BodyHandler.asString()).body();

		System.out.println(body);
	}
}
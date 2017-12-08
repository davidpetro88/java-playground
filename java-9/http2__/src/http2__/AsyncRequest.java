package http2;

import book.Book;
import book.Category;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AsyncRequest {

    public static void main(String[] args) throws Exception {
        saveCsv();

        all().forEach(book -> {
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Name: " + book.getName());
            System.out.println("Categories: " + book.getCategories());
            System.out.println("");
        });

    }

    private static void saveCsv() {
        try {
            HttpClient.newHttpClient().sendAsync(HttpRequest.newBuilder()
                            .uri(new URI("https://turini.github.io/livro-java-9/books.csv"))
                            .GET().build(),
                    HttpResponse.BodyHandler.asFile(Paths.get("AsyncBook.csv")))
                    .whenComplete((r,t)	-> System.out.println("arquivo	salvo	em:	"+	r.body().toAbsolutePath()))
                    .get();
        } catch (Exception e){
            throw new RuntimeException("Não foi possível conectar ", e);
        }
    }


    private static List<Book> all() {

        try {
            CompletableFuture<HttpResponse<String>> httpResponseCompletableFuture = HttpClient.newHttpClient().sendAsync(HttpRequest.newBuilder()
                            .uri(new URI("https://turini.github.io/livro-java-9/books.csv"))
                            .GET().build(),
                    HttpResponse.BodyHandler.asString())
                    .whenComplete((r, t) -> System.out.println(r.body()));

            return Stream.of(httpResponseCompletableFuture.get().body().split("\n"))
                    .map(AsyncRequest::create)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível conectar ", e);
        }
    }



    public static Book create(String line) {
        String[] split = line.split(",");
        String name = split[0];
        String author = split[2];
        Category category = Category.valueOf(split[3]);
        return new Book(name, author, category);
    }

}
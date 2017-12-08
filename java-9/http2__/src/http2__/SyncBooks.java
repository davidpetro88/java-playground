package impl;

import book.Book;
import book.Category;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;


import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SyncBooks {

    public static void main(String[] args) {

        saveCsv();

        all().forEach(book -> {
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Name: " + book.getName());
            System.out.println("Categories: " + book.getCategories());
            System.out.println("");
        });
    }

    public static void saveCsv() {
        try {
            HttpClient.newHttpClient().send(HttpRequest.newBuilder()
                            .uri(new URI("https://turini.github.io/livro-java-9/books.csv"))
                            .GET().build(),
                    HttpResponse.BodyHandler.asFile(Paths.get("SyncBooks.csv")));
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível conectar ", e);
        }
    }

    public static List<book.Book> all() {
        try {
            String csv = HttpClient.newHttpClient()
                    .send(HttpRequest.newBuilder()
                                    .uri(new URI("https://turini.github.io/livro-java-9/books.csv"))
                                    .GET().build(),
                            HttpResponse.BodyHandler.asString()).body();

            return Stream.of(csv.split("\n"))
                    .map(SyncBooks::create)
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

    public static Optional<Book> findSimilar(Book book) {
        return SyncBooks.all().stream()
                .filter(b -> b.getCategories().equals(book.getCategories()))
                .filter(b -> !b.getAuthor().equals(book.getAuthor()))
                .findAny();
    }
}
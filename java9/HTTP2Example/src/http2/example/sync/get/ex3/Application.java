package http2.example.sync.get.ex3;

public class Application {

    public static void main(String[] args) {
        System.out.println("Get All Books");
        Books.all().forEach(System.out::println);

        System.out.println("\n ---------------------------------------------------------------------------------------");
        System.out.println("Create Book");
        Book bookCreate = Books.create("Java 9,2018-06-02,David,PROGRAMMING");
        System.out.println(bookCreate);

        System.out.println("\n ---------------------------------------------------------------------------------------");
        System.out.println("Find Similar");
        Books.findSimilar(bookCreate)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Não existem similares")
                );

        System.out.println("\n ---------------------------------------------------------------------------------------");
        System.out.println("Chaining or");
        Books.findSimilar(bookCreate)
                .or(() -> Books.findSimilar(bookCreate)) // 2
                .or(() -> Books.findSimilar(bookCreate)); // 3
    }
}

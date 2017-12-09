import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * Created by david on 09/12/17.
 */
public class WebCrawler {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Java_(programming_language)")
//                .proxy("proxyweb.com.br", 8080)
                .get();

        System.out.println("Title :" + doc.body().select("h1#firstHeading").html());
        System.out.println("From :" + doc.body().select("div#siteSub.noprint").html());

        Stream<Element> stream = doc.body()
                .select("div#mw-content-text")
                .select("div.hatnote")
                .stream();
        stream.limit(3).forEach(c -> System.out.println(c.html()));

    }
}

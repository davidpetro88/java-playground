package breathFirstSearch.webCrawler;

public class App {

	public static void main(String[] args) {
		WebCrawler crawler = new WebCrawler();
		String rootUrl = "http://www.bbc.com";
		crawler.discovereWeb(rootUrl);
	}
}

package breathFirstSearch.webCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	private Queue<String> queue;
	private List<String> discoverWebSitesList;
	
	public WebCrawler() {
		this.queue = new LinkedList<>();
		this.discoverWebSitesList = new ArrayList<>();
	}
	
	public void discovereWeb(String root){
		this.queue.add(root);
		this.discoverWebSitesList.add(root);
		
		while(!queue.isEmpty()){
			String v = this.queue.remove();
			String rawHtml = readUrl(v);
			
			String regexp = "http://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHtml);
			
			while (matcher.find()) {
				String actualUrl = matcher.group();
				if(!discoverWebSitesList.contains(actualUrl)){
					discoverWebSitesList.add(actualUrl);
					System.out.println("Web Site has been found with URL: " + actualUrl);
					queue.add(actualUrl);
				}
				
			}
		}
	}

	private String readUrl(String v) {
		String rawHtml = "";
		try {
			URL url = new URL(v);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine = "";
			while((inputLine = in.readLine()) != null){
				rawHtml += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rawHtml;
	}
	
}

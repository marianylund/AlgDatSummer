package WebCrawler;

import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WebCrawler {

	private Queue<String> queue;
	private List<String> discoveredWebsites;
	
	public WebCrawler() {
		this.queue = new LinkedList<>();
		this.discoveredWebsites = new ArrayList<>();
	}
	
	public void discoverWeb(String root) {
		this.queue.add(root);
		this.discoveredWebsites.add(root);
		
		while(!queue.isEmpty()) {
			String v = this.queue.remove(); // a link
			String rawHtml = readURL(v);
			
			String regexp = "http://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHtml);
			
			while(matcher.find()) {
				String actualUrl = matcher.group();
				if(!discoveredWebsites.contains(actualUrl)) {
					discoveredWebsites.add(actualUrl);
					System.out.println("Website had been found with URL: " + actualUrl);
					queue.add(actualUrl);
				}
			}
		}
	}
	
	private String readURL(String v) {
		String rawHtml = "";
		try {
			URL url = new URL(v);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine = "";
			
			while((inputLine = in.readLine()) != null) {
				rawHtml += inputLine;
			}
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return rawHtml ;
	}
	
}

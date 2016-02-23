package monday;

import java.util.List;
import java.util.Queue;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	private static List<String> getAllLinks(String content) {
        ArrayList<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            if (matcher.group(1).charAt(0) == '/') {
            	resultList.add(content + matcher.group(1));
			}
            else {
            	resultList.add(content + "/" + matcher.group(1));
            }
        }
        return resultList;
    }

	public static void main(String[] args) throws MalformedURLException {

		List<String> links = getAllLinks("http://ebusiness.free.bg/");
		String needle = "Револвираща";
        String regex = "http://ebusiness.free.bg/";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(needle);
        if (matcher.find()) {
			System.out.println(regex);
			System.exit(0);
		}
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < links.size(); i++) {
			queue.add(links.get(i));
		}
		while(!queue.isEmpty()) {
			for (int i = 0; i < queue.size(); i++) {
				regex = queue.poll();
				pattern = Pattern.compile(regex);
				matcher = pattern.matcher(needle);
				if (matcher.find()) {
					System.out.println(regex);
					System.exit(0);
				}
				links = getAllLinks(regex);
				for (int j = 0; j < links.size(); j++) {
					queue.add(links.get(i));
				}
			}
		}

	}

}

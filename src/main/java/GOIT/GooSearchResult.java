package GOIT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GooSearchResult {

    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain(){
        String domain = url;
        String regex = "https?://([^/]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(domain);

        if (matcher.find()){
            return matcher.group(1);
        }
        return "";
    }
}

class GooSearchResultTest {
    public static void main(String[] args) {
//        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());
//
//        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

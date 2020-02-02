package pl.sda.gporlowski;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Connector {
    public static final String NOT_FOUND = "NOT FOUND";
    private static final String URL_TEMPLATE = "https://horoskopy.gazeta.pl/horoskop/[placeholder]/dzienny";

    public static String getPage(String zodiackSign) {
        String url = URL_TEMPLATE.replace("[placeholder]", zodiackSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(url).get().html();
        } catch (IOException e) {
            requestResult = NOT_FOUND;
            e.printStackTrace();
        }
        return requestResult;
    }

    /*public String getHoroscopeText(String pageAsText) {
        Pattern pattern = Pattern.compile("<h1 class=\"title\">Horoskop dzienny");
        Matcher matcher = pattern.matcher(pageAsText);
        if(matcher.find()){
            result = matcher.group();
        }
    }*/
}

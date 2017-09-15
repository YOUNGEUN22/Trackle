package com.gas.trackle.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Crawling {

    public static void  getArticle() throws Exception {
        Map<String, Object> map = new HashMap<>();

        String URL = "https://search.naver.com/search.naver?sm=tab_hty.top";
        Document doc = Jsoup.connect(URL).get();
        Elements side_news_tab = doc.select("div._aside_news_tab");
        Elements li = side_news_tab.select("ol > li");

        map.put("tag", new ArrayList<String>());

        for(int i=0; i<li.size(); i++) {
            Map<Integer, String> tag = new HashMap<>();
            tag.put(i+1, li.get(i).text());
        }

        map.toString();
    }
}

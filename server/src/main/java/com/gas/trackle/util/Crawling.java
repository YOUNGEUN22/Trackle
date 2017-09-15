package com.gas.trackle.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Crawling {

    public static void crwal() throws Exception {
        String clientID="0X3vribq9AGZPd9_pY74"; //네이버 개발자 센터에서 발급받은 clientID입력
        String clientSecret = "neCJaYXGUy";        //네이버 개발자 센터에서 발급받은 clientSecret입력
        URL url = new URL("https://openapi.naver.com/v1/search/news.json?query=java"); //API 기본정보의 요청 url을 복사해오고 필수인 query를 적어줍니당!

        URLConnection urlConn=url.openConnection(); //openConnection 해당 요청에 대해서 쓸 수 있는 connection 객체

        urlConn.setRequestProperty("X-Naver-Client-ID", clientID);
        urlConn.setRequestProperty("X-Naver-Client-Secret", clientSecret);

        BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

        String msg = null;
        while((msg = br.readLine())!=null)
        {
            System.out.println(msg);
        }
    }
}

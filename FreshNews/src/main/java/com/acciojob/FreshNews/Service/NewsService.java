package com.acciojob.FreshNews.Service;

import com.acciojob.FreshNews.Response.newsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

    public newsResponse getNews(String country, String apiKey) {
        String url= prepareString(country,apiKey);
        return restTemplate.getForObject(url, newsResponse.class);
    }

    private String prepareString(String country, String apiKey) {
        return "https://newsapi.org/v2/top-headlines?country="+country+"&apiKey="+apiKey;
    }
}

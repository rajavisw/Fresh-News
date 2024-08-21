package com.acciojob.FreshNews.Controller;

import com.acciojob.FreshNews.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class NewsController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    NewsService newsService;

    @GetMapping("/get-news")
    public Object getNews(@RequestParam("country") String country, @RequestParam("apiKey") String apiKey ){
        return newsService.getNews(country,apiKey);
    }
}

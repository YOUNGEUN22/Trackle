package com.gas.trackle.api;

import com.gas.trackle.domain.Article;
import com.gas.trackle.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleAPI {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/api/topnews", method = RequestMethod.GET)
    public List<Article> getTopNews() {

        return articleService.findTop10News();
    }
}

package com.gas.trackle.service;

import com.gas.trackle.domain.Article;

import java.util.List;

public interface ArticleService {

    public List<Article> findTop10News();
}

package com.gas.trackle.service;

import com.gas.trackle.domain.Article;
import com.gas.trackle.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> findTop10News() {
        return articleRepository.findTop10ByOrderByIdDesc();
    }
}

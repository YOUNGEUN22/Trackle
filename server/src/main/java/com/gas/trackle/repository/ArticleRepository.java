package com.gas.trackle.repository;

import com.gas.trackle.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    List<Article> findTop10ByOrderByIdDesc();
}

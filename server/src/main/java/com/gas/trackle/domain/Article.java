package com.gas.trackle.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "image")
    private String image;

    @Column(name = "company")
    private String company;

    @Column(name = "keyword")
    private String keyword;

    public Article() {
    }

    public Article(String title, String content, String image, String company, String keyword) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.company = company;
        this.keyword = keyword;
    }
}

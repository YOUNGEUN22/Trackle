package com.gas.trackle.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String image;

    @Column
    private String company;

    @Column
    private String keyword;
}

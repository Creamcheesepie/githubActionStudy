package com.back.domain.article.service;

import com.back.domain.article.entity.Article;
import com.back.domain.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }

    public Article writeArticle(Article article){

    }

}

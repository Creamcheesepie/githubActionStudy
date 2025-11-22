package com.back.githubactiontest.domain.article.service;

import com.back.githubactiontest.domain.article.entity.Article;
import com.back.githubactiontest.domain.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }

    public Article writeArticle(String title,String content){
        Article article = new Article(title, content);
        return articleRepository.save(article);
    }

}

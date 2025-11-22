package com.back.githubactiontest.domain.article.controller;

import com.back.githubactiontest.domain.article.entity.Article;
import com.back.githubactiontest.domain.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/list")
    public String listArticle(Model model){
        List<Article> articles = articleService.getAllArticles();
        model.addAttribute("articleList",articles);
        return "/article/list";
    }

    @GetMapping("/write")
    public String writeArticle(Model model) {
        return "/article/write";
    }

    @PostMapping("/write")
    public String writeArticle(
            @RequestParam String title,
            @RequestParam String content
    ) {
        articleService.writeArticle(title, content);
        return "redirect:/article/list";
    }
}

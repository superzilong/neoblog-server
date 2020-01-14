package me.zilong.simpleblog.controller;

import me.zilong.simpleblog.models.Article;
import me.zilong.simpleblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/articles")
public class ArticleController {

    @Autowired
    ArticleService articleSrv;

    @GetMapping
    public List<Article> getArticleList() {
        return articleSrv.getAllArticle();
    }

    @GetMapping("/lite")
    public List<Object> getArticleLiteList() {
        return articleSrv.getAllArticleIdAndTitles();
    }

    @PostMapping
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    public String postArticle(@RequestBody Article article) {
        articleSrv.addNewArticle(article);
        System.out.print(article);
        return "success";
    }

    @GetMapping(value="/{id}")
    public Article getArticle(@PathVariable Long id) {
        return articleSrv.getArticleById(id);
    }

    @PutMapping(value="/{id}")
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    public String putArticle(@PathVariable Long id, @RequestBody Article article) {
        Article a = articleSrv.getArticleById(id);
        a.setTitle(article.getTitle());
        a.setMdContent(article.getMdContent());
        a.setHtmlContent(article.getHtmlContent());
        a.setSummary(article.getSummary());
        a.setPublishDate(article.getPublishDate());
        articleSrv.modifyArticle(a);
        return "success";
    }

    @DeleteMapping(value="/{id}")
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    public String deleteArticle(@PathVariable Long id) {
        articleSrv.deleteArticleById(id);
        return "success";
    }
}

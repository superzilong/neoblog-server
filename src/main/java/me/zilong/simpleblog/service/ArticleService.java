package me.zilong.simpleblog.service;

import me.zilong.simpleblog.models.Article;
import me.zilong.simpleblog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.google.common.collect.Lists;

@Service
@Transactional
public class ArticleService {
    @Autowired
    ArticleRepository articleRepo;

    public String addNewArticle(Article article) {
        articleRepo.save(article);
        return "success";
    }

    public List<Article> getAllArticle() {
        List<Article> res = Lists.newArrayList(articleRepo.findAll());
        return res;
    }

    public Article getArticleById (Long id)
    {
        return articleRepo.findById(id).get();
    }

    public String modifyArticle(Article article)
    {
        articleRepo.save(article);
        return "success";
    }

    public String deleteArticleById(Long id)
    {
        articleRepo.deleteById(id);
        return "success";
    }

    public List<Object> getAllArticleIdAndTitles()
    {
        return articleRepo.findAllIdAndTitle();
    }
}

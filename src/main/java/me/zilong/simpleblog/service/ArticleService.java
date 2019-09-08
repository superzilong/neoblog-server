package me.zilong.simpleblog.service;

import me.zilong.simpleblog.data.Article;
import me.zilong.simpleblog.data.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleService {
    @Autowired
    ArticleRepository articleRepo;

    public int addNewArticle(Article article) {
        articleRepo.save(article);
        return 0;
    }


}

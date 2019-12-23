package me.zilong.simpleblog.repository;

import me.zilong.simpleblog.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long>{

}

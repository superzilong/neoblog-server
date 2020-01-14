package me.zilong.simpleblog.repository;

import me.zilong.simpleblog.models.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long>{
    @Query(value = "select id, title, publish_date from article", nativeQuery = true)
    List<Object> findAllIdAndTitle();
}

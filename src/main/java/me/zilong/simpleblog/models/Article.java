package me.zilong.simpleblog.models;

import javax.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    @Lob
    private String mdContent;
    @Lob
    private String htmlContent;
    private String summary;

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String datetime) {
        this.publishDate = datetime;
    }

    private String publishDate;

    protected Article() {}

    public Article(String title) {
        this.setTitle(title);
    }

    @Override
    public String toString() {
        return String.format(
                "Article[id=%d, title='%s',datetime='%s']",
                getId(), getTitle(), getPublishDate());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMdContent() {
        return mdContent;
    }

    public void setMdContent(String mdContent) {
        this.mdContent = mdContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

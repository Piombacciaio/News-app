package com.piombacciaio.news;

import java.util.ArrayList;

public class mainnews {

    private String status;
    private String totalResults;
    private ArrayList<Model> articles;

    public mainnews(String status, String totalResults, ArrayList<Model> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Model> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Model> articles) {
        this.articles = articles;
    }
}
package com.abdullah.books.model;

public class CategoryModel {

    private String categoryIconLink;
    private String categoryName;

    public CategoryModel(String link, String categoryName) {
        this.categoryIconLink = categoryIconLink;
        this.categoryName = categoryName;
    }


    public String getCategoryIconLink() {
        return categoryIconLink;
    }

    public void setCategoryIconLinkLink(String link) {
        this.categoryIconLink = link;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

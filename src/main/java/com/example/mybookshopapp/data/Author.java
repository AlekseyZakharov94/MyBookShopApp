package com.example.mybookshopapp.data;

public class Author {

    private Integer id;
    private String authorFullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorFullName='" + authorFullName + '\'' +
                '}';
    }
}

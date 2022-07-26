package com.example.mybookshopapp.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Author> getAllAuthors() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors ", (ResultSet rs, int rowNumber) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setAuthorFullName(rs.getString("authorFullName"));
            return author;
        });
        return new ArrayList<>(authors);
    }
}

package com.example.mybookshopapp.controllers;

import com.example.mybookshopapp.data.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorsPageController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/authors")
    public String genrePage(Model model) {
        model.addAttribute("authorsList", authorService.getAllAuthors());
        return "authors/index";
    }
}

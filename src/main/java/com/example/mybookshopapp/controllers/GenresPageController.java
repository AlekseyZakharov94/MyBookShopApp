package com.example.mybookshopapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresPageController {

    @GetMapping("/genres")
    public String genrePage() {
        return "genres/index";
    }
}
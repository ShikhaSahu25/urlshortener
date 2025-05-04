package com.shikha.urlshortener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLController {
    @GetMapping("/ping")
    public String ping() {
        System.out.println("Ping hit");
        return "Hi there!";
    }
}

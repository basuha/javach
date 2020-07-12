package com.basuha.javach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("{id}")
    public String main(@PathVariable String id) {
        return "main";
    }
}

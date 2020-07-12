package com.basuha.javach.controller;

import com.basuha.javach.repo.JavachThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    private JavachThreadRepo threadRepo;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("threadList", threadRepo.findAll());
        return "main";
    }

    @GetMapping("{id}")
    public String main(@PathVariable String id) {
        return "main";
    }
}

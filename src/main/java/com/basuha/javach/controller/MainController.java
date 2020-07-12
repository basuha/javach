package com.basuha.javach.controller;

import com.basuha.javach.repo.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private BoardRepo boardRepo;

    @GetMapping("/b")
    public String main(Model model) {
        model.addAttribute("threadList", boardRepo.findAll());
        return "b";
    }

    @PostMapping("/{boardId}/{threadId}")
    public String createThread(@PathVariable String boardId, @PathVariable Long threadId) {
        return "";
    }

    @GetMapping("/{boardId}/{threadId}")
    public String thread(@PathVariable String boardId, @PathVariable Long threadId) {
        return "b";
    }
}

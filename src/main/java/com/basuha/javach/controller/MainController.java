package com.basuha.javach.controller;

import com.basuha.javach.model.Board;
import com.basuha.javach.model.JavachThread;
import com.basuha.javach.repo.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class MainController {

    @Autowired
    private BoardRepo boardRepo;

    @GetMapping("/")
    public String main(Model model) {
        boardRepo.save(new Board("pr","Программирование")); //TODO: for dev only
        boardRepo.save(new Board("b","Бред"));
        model.addAttribute("boardList", boardRepo.findAll());
        return "index";
    }

    @GetMapping("/{boardId}")
    public String board(Model model, @PathVariable String boardId) {
        boardRepo.getById(boardId).setThreads(new ArrayList<>(Arrays.asList(
                new JavachThread(System.currentTimeMillis(),"Anonymous","asfkasflkjafsjlkfasfsljksfjlakjsf"),
                new JavachThread(System.currentTimeMillis(),"Anonymous","asfkasflkjafsjlkfasfsljksfjlakjsf"),
                new JavachThread(System.currentTimeMillis(),"Anonymous","asfkasflkjafsjlkfasfsljksfjlakjsf"),
                new JavachThread(System.currentTimeMillis(),"Anonymous","asfkasflkjafsjlkfasfsljksfjlakjsf"),
                new JavachThread(System.currentTimeMillis(),"Anonymous","asfkasflkjafsjlkfasfsljksfjlakjsf"),
                new JavachThread(System.currentTimeMillis(),"Anonymous","asfkasflkjafsjlkfasfsljksfjlakjsf")
        )));
        model.addAttribute("threadList", boardRepo.getById(boardId).getThreads());
        model.addAttribute("dummyImg", "file:///D:/!java/javach/images/dummy.jpg");
        return "board";
    }

    @PostMapping("/{boardId}/{threadId}")
    public String createThread(@PathVariable String boardId, @PathVariable Long threadId) {
        return "";
    }

    @GetMapping("/{boardId}/{threadId}")
    public String thread(@PathVariable String boardId, @PathVariable Long threadId) {
        return "board";
    }
}

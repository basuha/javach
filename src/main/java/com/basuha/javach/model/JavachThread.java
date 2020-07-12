package com.basuha.javach.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "thread")
public class JavachThread {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long time;
    private String author;
    private String text;

    @OneToMany
    private List<String> images;

    @OneToMany
    private List<Post> posts;

    public static void main(String[] args) {
        System.out.println(new Date().toString());
    }
}

package com.basuha.javach.model;

import javax.persistence.*;

@Entity
@Table(name = "javach_post")
public class Post extends JavachThread {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "thread_id")
    private JavachThread thread;
}
package com.basuha.javach.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "javach_post")
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;
    @NonNull
    protected Long time;
    @NonNull
    protected String author;
    @NonNull
    @Column(length = 1028)
    protected String text;

    protected String filename;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "thread_id")
    private JavachThread thread;
}
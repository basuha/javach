package com.basuha.javach.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Board {
    @Id
    private String id;

    private String description;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<JavachThread> threads;
}

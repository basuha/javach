package com.basuha.javach.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Board {
    @Id
    @NonNull
    private String id;

    @NonNull
    private String description;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<JavachThread> threads;
}

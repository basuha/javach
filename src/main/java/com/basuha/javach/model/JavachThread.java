package com.basuha.javach.model;

import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "javach_thread")
public class JavachThread {
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

    protected String imageLink;

    @OneToMany(mappedBy = "thread", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Post> posts;
}

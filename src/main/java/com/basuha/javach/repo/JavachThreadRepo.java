package com.basuha.javach.repo;

import com.basuha.javach.model.JavachThread;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JavachThreadRepo extends CrudRepository<JavachThread, Long> {
    List<JavachThread> findAll();
}
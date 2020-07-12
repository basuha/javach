package com.basuha.javach.repo;

import com.basuha.javach.model.Board;
import com.basuha.javach.model.JavachThread;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardRepo extends CrudRepository<Board, String> {
    List<Board> findAll();
}
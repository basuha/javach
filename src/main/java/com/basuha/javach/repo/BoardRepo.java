package com.basuha.javach.repo;

import com.basuha.javach.model.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepo extends CrudRepository<Board, String> {
    Iterable<Board> findAll();
    Board getById(String id);
}
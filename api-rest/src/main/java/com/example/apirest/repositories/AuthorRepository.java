package com.example.apirest.repositories;

import com.example.apirest.entities.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends BaseRepository<Author,Long> {
}

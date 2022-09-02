package com.example.apirest.repositories;

import com.example.apirest.entities.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends BaseRepository<Person,Long> {
}

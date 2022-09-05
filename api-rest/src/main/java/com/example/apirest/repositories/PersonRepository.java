package com.example.apirest.repositories;

import com.example.apirest.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {

    @Query(
            value = "SELECT * FROM person WHERE person.first_name LIKE %:filter% OR person.last_name LIKE %:filter%",
            nativeQuery = true
    )
    List<Person> search(@Param("filter") String filter);

    @Query(
            value = "SELECT * FROM person WHERE person.first_name LIKE %:filter% OR person.last_name LIKE %:filter%",
            countQuery = "SELECT count(*) FROM person",
            nativeQuery = true
    )
    Page<Person> search(@Param("filter") String filter, Pageable pageable);
}

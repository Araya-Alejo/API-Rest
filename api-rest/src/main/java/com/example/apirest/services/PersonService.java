package com.example.apirest.services;

import com.example.apirest.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonService extends BaseService<Person, Long>{
    List<Person> search(String filter) throws Exception;
    Page<Person> search(String filter, Pageable pageable) throws Exception;
}

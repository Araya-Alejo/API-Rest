package com.example.apirest.services;

import com.example.apirest.entities.Person;

import java.util.List;

public interface PersonService extends BaseService<Person, Long>{
    List<Person> search(String filter) throws Exception;
}

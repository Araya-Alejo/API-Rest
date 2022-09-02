package com.example.apirest.services;

import com.example.apirest.entities.Person;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends BaseServiceImpl<Person, Long> implements PersonService{
	@Autowired
	private PersonRepository personRepository;

	public PersonServiceImpl ( BaseRepository<Person, Long> baseRepository ) {
		super( baseRepository );
	}
}

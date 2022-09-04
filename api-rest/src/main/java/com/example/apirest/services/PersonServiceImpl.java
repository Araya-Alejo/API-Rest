package com.example.apirest.services;

import com.example.apirest.entities.Person;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl extends BaseServiceImpl<Person, Long> implements PersonService{

	public PersonServiceImpl ( BaseRepository<Person, Long> baseRepository ) {
		super( baseRepository );
	}

	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> search(String filter) throws Exception{
		try{
			//List<Person> persons = PersonRepository.search(filter);
			return personRepository.search(filter);
		}catch (Exception e){
			throw new Exception(e.getMessage());
		}
	}
}

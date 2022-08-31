package com.example.apirest.services;

import com.example.apirest.entities.Person;
import com.example.apirest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements BaseService<Person> {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional
	public List<Person> findAll ( ) throws Exception {
		try {
			return personRepository.findAll( );
		} catch ( Exception e ) {
			throw new Exception( e.getMessage( ) );
		}
	}

	@Override
	@Transactional
	public Person findById ( Long id ) throws Exception {
		try {
			Optional<Person> entityOptional = personRepository.findById( id );
			return entityOptional.get( );
		} catch ( Exception e ) {
			throw new Exception( e.getMessage( ) );
		}
	}

	@Override
	@Transactional
	public Person save ( Person entity ) throws Exception {
		try {
			entity = personRepository.save( entity );
			return entity;
		} catch ( Exception e ) {
			throw new Exception( e.getMessage( ) );
		}
	}

	@Override
	@Transactional
	public Person update ( Long id , Person entity ) throws Exception {
		try {
			Optional<Person> entityOptional = personRepository.findById( id );
			Person person = entityOptional.get( );
			person = personRepository.save( person );
			return person;
		} catch ( Exception e ) {
			throw new Exception( e.getMessage( ) );
		}
	}

	@Override
	@Transactional
	public boolean delete ( Long id ) throws Exception {
		try {
			if ( personRepository.existsById( id ) ) {
				personRepository.deleteById( id );
				return true;
			} else {
				throw new Exception(  );
			}
		} catch ( Exception e ) {
			throw new Exception( e.getMessage( ) );
		}
	}

}

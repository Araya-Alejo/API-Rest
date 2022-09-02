package com.example.apirest.services;

import com.example.apirest.entities.Author;
import com.example.apirest.repositories.AuthorRepository;
import com.example.apirest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends BaseServiceImpl<Author, Long> implements AuthorService{

	@Autowired
	private AuthorRepository authorRepository;

	public AuthorServiceImpl ( BaseRepository<Author, Long> baseRepository ) {
		super( baseRepository );
	}
}

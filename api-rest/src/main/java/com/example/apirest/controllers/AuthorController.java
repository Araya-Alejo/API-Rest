package com.example.apirest.controllers;

import com.example.apirest.entities.Author;
import com.example.apirest.services.AuthorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping( path = "api/v1/authors" )
public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImpl>{
}

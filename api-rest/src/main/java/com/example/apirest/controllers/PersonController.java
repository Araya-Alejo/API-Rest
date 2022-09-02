package com.example.apirest.controllers;

import com.example.apirest.entities.Person;
import com.example.apirest.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping( path = "api/v1/persons" )
public class PersonController extends BaseControllerImpl<Person, PersonServiceImpl>{
}

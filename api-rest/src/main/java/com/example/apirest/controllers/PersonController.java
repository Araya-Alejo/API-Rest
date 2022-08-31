package com.example.apirest.controllers;

import com.example.apirest.entities.Person;
import com.example.apirest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping( path = "api/v1/persons" )
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping( "" )
	public ResponseEntity<?> getAll ( ) {
		try {
			return ResponseEntity.status( HttpStatus.OK).body(personService.findAll());
		}catch ( Exception e ) {
			return ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "\"error\":\"Error. Por gavot intente mas tarde.\"}" );
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getOne( @PathVariable Long id ){
		try {
			return ResponseEntity.status( HttpStatus.OK).body(personService.findById( id ));
		}catch ( Exception e ) {
			return ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "\"error\":\"Error. Por gavot intente mas tarde.\"}" );
		}
	}

	@PostMapping("")
	public ResponseEntity<?> save(@RequestBody Person entity){
		try {
			return ResponseEntity.status( HttpStatus.OK).body(personService.save( entity ));
		}catch ( Exception e ) {
			return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( "\"error\":\"Error. Por gavot intente mas tarde.\"}" );
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Person entity){
		try {
			return ResponseEntity.status( HttpStatus.OK).body(personService.update( id,entity ));
		}catch ( Exception e ) {
			return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( "\"error\":\"Error. Por gavot intente mas tarde.\"}" );
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		try {
			return ResponseEntity.status( HttpStatus.NO_CONTENT).body(personService.delete( id ));
		}catch ( Exception e ) {
			return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( "\"error\":\"Error. Por gavot intente mas tarde.\"}" );
		}
	}
}

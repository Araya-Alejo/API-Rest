package com.example.apirest.controllers;

import com.example.apirest.entities.Person;
import com.example.apirest.services.PersonServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping( path = "api/v1/persons" )
public class PersonController extends BaseControllerImpl<Person, PersonServiceImpl>{

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filter){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filter));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

}

package com.example.apirest.controllers;

import com.example.apirest.entities.Location;
import com.example.apirest.services.LocationServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( origins = "*" )
@RequestMapping( path = "api/v1/locations" )
public class LocationController extends BaseControllerImpl<Location, LocationServiceImpl>{
}

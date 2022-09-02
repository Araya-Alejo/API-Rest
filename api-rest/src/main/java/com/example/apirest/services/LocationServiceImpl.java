package com.example.apirest.services;

import com.example.apirest.entities.Location;
import com.example.apirest.repositories.BaseRepository;
import com.example.apirest.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl extends BaseServiceImpl<Location, Long> implements LocationService{

	@Autowired
	private LocationRepository locationRepository;

	public LocationServiceImpl(BaseRepository<Location, Long> baseRepository ) {
		super( baseRepository );
	}
}

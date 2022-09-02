package com.example.apirest.repositories;

import com.example.apirest.entities.Location;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends BaseRepository<Location,Long> {
}

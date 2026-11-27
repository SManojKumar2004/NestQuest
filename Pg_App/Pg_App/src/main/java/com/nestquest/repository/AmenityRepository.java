package com.nestquest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestquest.entity.Amenity;

@Repository
public interface AmenityRepository extends JpaRepository<Amenity, Integer> {

}

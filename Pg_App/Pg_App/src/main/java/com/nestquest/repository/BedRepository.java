package com.nestquest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestquest.entity.Bed;

@Repository
public interface BedRepository extends JpaRepository<Bed, Integer> {

}

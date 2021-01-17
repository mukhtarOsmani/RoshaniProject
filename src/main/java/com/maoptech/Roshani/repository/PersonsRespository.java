package com.maoptech.Roshani.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maoptech.Roshani.Entities.Persons;

@Repository
public interface PersonsRespository extends JpaRepository<Persons, Long> {

	
}

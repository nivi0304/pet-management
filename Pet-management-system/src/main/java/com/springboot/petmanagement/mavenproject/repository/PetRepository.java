package com.springboot.petmanagement.mavenproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.petmanagement.mavenproject.model.Pet;

public interface PetRepository  extends JpaRepository<Pet, Long>{

}

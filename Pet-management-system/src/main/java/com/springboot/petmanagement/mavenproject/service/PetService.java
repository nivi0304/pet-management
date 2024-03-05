package com.springboot.petmanagement.mavenproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.petmanagement.mavenproject.model.Pet;
import com.springboot.petmanagement.mavenproject.repository.PetRepository;

@Service
public class PetService {
	
	
	@Autowired
	PetRepository petrepo;
	
	public List<Pet> getAllPets(){
		return petrepo.findAll();	
	}
	public ResponseEntity<Pet> addPet(Pet pet) {
        Pet savedPet = petrepo.save(pet);
        return new ResponseEntity<>(savedPet, HttpStatus.CREATED);
    }
	

	
	public void deletePet(long id) {
		petrepo.deleteById((int) id);
	}
	
	
}

package com.springboot.petmanagement.mavenproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.petmanagement.mavenproject.model.Pet;
import com.springboot.petmanagement.mavenproject.service.PetService;

@RestController
public class PetController {

	@Autowired
	PetService petservice;
	
	@GetMapping ("/hello")
	public String loginform() {
    	return "This is homepage!!";
    }
	
	@GetMapping ("/records")
    public List<Pet> getAllPets() {
        return petservice.getAllPets();
    }
	@PostMapping ("/allrecords")
    public ResponseEntity<Pet> addPet(@RequestBody Pet pet) {
        return petservice.addPet(pet);
    }
	 @DeleteMapping("/drop/{id}")
	    public void deletePet(@PathVariable long id) {
	        petservice.deletePet(id);
	    }
	
}

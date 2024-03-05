package com.springboot.petmanagement.mavenproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.server.ResponseStatusException;

import com.springboot.petmanagement.mavenproject.model.Pet;
import com.springboot.petmanagement.mavenproject.repository.PetRepository;

@Service
public class PetService {
	
	
	@Autowired
	PetRepository petrepo;
	
	public List<Pet> getAllPets(){
		return petrepo.findAll();	
	}
	public ResponseEntity<Pet> addPet(@ModelAttribute Pet pet) {
        Pet savedPet = petrepo.save(pet);
        return new ResponseEntity<>(savedPet, HttpStatus.CREATED);
    }
	

	
	public void deletePet(long id) {
		petrepo.deleteById(id);
	}
	public void updatePet(Long id, Pet updatedPet) {
        Pet existingPet = petrepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet not found with id: " + id));

        
        existingPet.setName(updatedPet.getName());
        existingPet.setBreed(updatedPet.getBreed());
        existingPet.setAge(updatedPet.getAge());
        
        petrepo.save(existingPet);
    }
	
	
}

package com.dog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dog.model.Breed;
import com.dog.repository.BreedRepository;

@Service
public class BreedService {
	@Autowired
	private BreedRepository breedRepository;
	
	public List<Breed> list(){
		return breedRepository.findAll();
	}
	
	public Breed searchName(String name){
		return breedRepository.findByName(name);
	}

}

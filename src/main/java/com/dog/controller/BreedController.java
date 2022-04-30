package com.dog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dog.model.Breed;
import com.dog.services.BreedService;

@RestController
@RequestMapping("/breeds")
public class BreedController {
	@Autowired
	private BreedService breedService;
	
	@GetMapping
	public List<Breed> list(){
		return breedService.list();
	}
	
	@GetMapping("/search/{name}")
	public Breed search(@PathVariable String name){
		return breedService.searchName(name);
	}
	
}

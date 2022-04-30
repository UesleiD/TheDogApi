package com.dog.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dog.model.Favourite;
import com.dog.services.FavouriteService;

@RestController
@RequestMapping("/favourites")
public class FavouritesController {
	@Autowired
	private FavouriteService favouriteService;
	
	@GetMapping
	public List<Favourite> list(){
		return favouriteService.list();
	}
	
	@GetMapping("/{id}")
	public Favourite search(@PathVariable String id){
		return favouriteService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<Favourite> removeFavourite(@PathVariable String id){
		favouriteService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	@Transactional
	public Favourite createFavourite(@RequestBody Favourite favourite) {
		return favouriteService.create(favourite);
	}
	
	
}

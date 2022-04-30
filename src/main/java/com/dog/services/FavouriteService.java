package com.dog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dog.model.Favourite;
import com.dog.repository.FavouriteRepository;

@Service
public class FavouriteService {
	@Autowired
	private FavouriteRepository favouriteRepository;
	
	public List<Favourite> list(){
		return favouriteRepository.findAll();
	}
	
	public Favourite findById(String id){
		return favouriteRepository.getById(id);
	}
	
	public Favourite search(String id){
		return favouriteRepository.getById(id);
	}
	
	public void delete(@PathVariable String id){
		favouriteRepository.deleteById(id);
	}
	
	public Favourite create(Favourite favourite) {
		return favouriteRepository.save(favourite);
	}
	
}

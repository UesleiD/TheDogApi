package com.dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dog.model.Favourite;

public interface FavouriteRepository extends JpaRepository<Favourite, String>{

}

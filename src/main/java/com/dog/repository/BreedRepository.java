package com.dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dog.model.Breed;

public interface BreedRepository extends JpaRepository<Breed, String> {
	@Query(value = "SELECT a.* "
				 + "FROM Breed a "
				 + "WHERE name LIKE :nameDog", nativeQuery = true)
	Breed findByName(String nameDog);
}

package com.dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dog.model.Categories;

public interface CategoryRepository extends JpaRepository<Categories, String>{

}

package com.dog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dog.model.Categories;
import com.dog.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Categories> list(){
		return categoryRepository.findAll();
	}
	
}

package com.dog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dog.model.Categories;
import com.dog.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public List<Categories> list(){
		return categoryService.list();
	}
}

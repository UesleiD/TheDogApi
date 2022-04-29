package com.dog.model;

import java.util.List;

public class Image {

	public String id;
	public String url;
	public List<Categories> categories;
	public List<Breed> breeds;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<Categories> getCategories() {
		return categories;
	}
	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}
	public List<Breed> getBreeds() {
		return breeds;
	}
	public void setBreeds(List<Breed> breeds) {
		this.breeds = breeds;
	}
	
	
	
	
	
}

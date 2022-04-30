package com.dog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
public class Breed {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public String id;
	public String name;
	public String temperament;
	public String life_span;
	public String alt_names;
	public String wikipedia_url;
	public String origin;
	public String weight;
	public String country_code;
	public String height;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemperament() {
		return temperament;
	}
	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}
	public String getLife_span() {
		return life_span;
	}
	public void setLife_span(String life_span) {
		this.life_span = life_span;
	}
	public String getAlt_names() {
		return alt_names;
	}
	public void setAlt_names(String alt_names) {
		this.alt_names = alt_names;
	}
	public String getWikipedia_url() {
		return wikipedia_url;
	}
	public void setWikipedia_url(String wikipedia_url) {
		this.wikipedia_url = wikipedia_url;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public void updateBreed(String id2, Breed breedUpdate) {
		// TODO Auto-generated method stub
		
	}

}

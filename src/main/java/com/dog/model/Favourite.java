package com.dog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor
public class Favourite{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public String id;
	public String image_id;
	public String sub_id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate created_at = LocalDate.now();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public String getSub_id() {
		return sub_id;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	public LocalDate getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}
	
}

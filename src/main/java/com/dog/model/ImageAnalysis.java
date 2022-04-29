package com.dog.model;

import java.util.List;

public class ImageAnalysis {

	public String image_id;
	public List<Object> labels;
	public List<Object> moderation_labels;
	public String vendor;
	public Integer approved;
	public Integer reject;
	
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public List<Object> getLabels() {
		return labels;
	}
	public void setLabels(List<Object> labels) {
		this.labels = labels;
	}
	public List<Object> getModeration_labels() {
		return moderation_labels;
	}
	public void setModeration_labels(List<Object> moderation_labels) {
		this.moderation_labels = moderation_labels;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Integer getApproved() {
		return approved;
	}
	public void setApproved(Integer approved) {
		this.approved = approved;
	}
	public Integer getReject() {
		return reject;
	}
	public void setReject(Integer reject) {
		this.reject = reject;
	}
	
	
	
	
}

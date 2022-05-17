package com.jobiak.mdb.model;

import org.springframework.data.annotation.Id;

public class GroceryItems {
	
	@Id //primary Key
	private Long proId;
	private String name;
	private String catgry;
	private Double qunty;
	
	public Long getProId() {
		return proId;
	}
	public void setProId(Long proId) {
		this.proId = proId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatgry() {
		return catgry;
	}
	public void setCatgry(String catgry) {
		this.catgry = catgry;
	}
	public Double getQunty() {
		return qunty;
	}
	public void setQunty(Double qunty) {
		this.qunty = qunty;
	}

}

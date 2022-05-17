package com.jobiak.mdb.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductController {
	
	@Autowired
	ItemRepository gitemrepo;

	public ProductController(ItemRepository gitemrepo) {	
		this.gitemrepo = gitemrepo;
	}	

}
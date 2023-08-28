package com.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.products.entity.Products;
import com.products.repository.ProductsRepository;

@Repository
public class ProductsDao {
	@Autowired
	ProductsRepository pr;

	public String setProd(Products prod) {
		pr.save(prod);
		return "Saved";
	}
	public String setAllProd(List<Products> prod) {
		pr.saveAll(prod);
		return "List Saved";
	}
	public List<Products> getAll() {
		return pr.findAll();
	}

}

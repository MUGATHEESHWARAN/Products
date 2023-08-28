package com.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.products.customexception.ColorNotFoundException;
import com.products.dao.ProductsDao;
import com.products.entity.Products;

@Service
public class ProductsService {
	@Autowired
	ProductsDao pd;

	public String setProd(Products prod) throws ColorNotFoundException {
		if(prod.getColor().equalsIgnoreCase("Black")) {
		return pd.setProd(prod);
		}
		else {
			throw new ColorNotFoundException("Not Aaliable Color");
		}
	}

	public String setAllProd(List<Products> prod) {
		return pd.setAllProd(prod);
	}
	public List<Products> getAll() {
		return pd.getAll();
	}

}

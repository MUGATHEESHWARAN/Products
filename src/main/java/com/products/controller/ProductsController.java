package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.customexception.ColorNotFoundException;
import com.products.entity.Products;
import com.products.service.ProductsService;

@RestController
@RequestMapping("/prod")
public class ProductsController {
	@Autowired
	ProductsService ps;

	@PostMapping("/setProducts")
	public String setProd(@RequestBody Products prod) throws ColorNotFoundException {
		return ps.setProd(prod);
	}
	@PostMapping("setAll")
	public String setAllProd(@RequestBody List<Products> prod) {
		return ps.setAllProd(prod);
	}
	@GetMapping("/getString")
	public String GetString(String s) {
		return "Hello World";
	}
	@GetMapping("/getAll")
	public List<Products> getAll() {
		return ps.getAll();
	}

}

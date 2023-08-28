package com.products.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.products.entity.Products;

public interface ProductsRepository extends JpaRepositoryImplementation<Products, Integer> {


}

package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Number>{
	/*
	 * All CRUD methods will be auto implemented here!!!!
	 * 
	 */
}

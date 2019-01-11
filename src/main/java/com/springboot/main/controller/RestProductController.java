package com.springboot.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.entity.ProductEntity;
import com.springboot.main.pojo.Product;
import com.springboot.main.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class RestProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Product REST API Version 1.0";
	}	
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public List<ProductEntity> addProduct(@RequestBody Product p) {
		return productService.addProduct(p);
	}
	
	@RequestMapping(value = "/delete", method=RequestMethod.DELETE)
	public List<ProductEntity> deleteProduct(@RequestBody Product p) {
		return productService.deleteProduct(p);
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public Product getProductById(@PathVariable("id") int id){
		return productService.getProductById(id);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List getAllProduct(){
		return productService.getAllProduct();
	}
	
	@RequestMapping(value="update/{id}", method=RequestMethod.POST)
	public List updateProduct(@PathVariable("id") int myid, @RequestBody Product p ) {
		return productService.updateProduct(myid, p);
	}

}

package com.springboot.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.main.entity.ProductEntity;
import com.springboot.main.pojo.Product;
import com.springboot.main.repository.ProductRepository;

@Repository("productDao")
public class ProductDAO {
	
	@Autowired
	ProductRepository productRepository;

	public List<ProductEntity> addProduct(Product p) {
		// TODO Auto-generated method stub
		ProductEntity pe = new ProductEntity();
		pe.setName(p.getName());
		pe.setPrice(p.getPrice());
		pe.setCategoryid(p.getCategoryid());
				
		productRepository.saveAndFlush(pe);
		return productRepository.findAll();
		
		
		
		
	}
	public List<ProductEntity> deleteProduct(Product p) {
		// TODO Auto-generated method stub
		ProductEntity pe = new ProductEntity();
		pe.setName(p.getName());
		pe.setPrice(p.getPrice());
		pe.setCategoryid(p.getCategoryid());
				
		productRepository.delete(pe);
		System.out.println();
		return productRepository.findAll();
		
		
	}
	public Product getProductById(int id){
		ProductEntity pe =  productRepository.findById(id).get();
		Product p = new Product();
		p.setId(pe.getId());
		p.setName(pe.getName());
		p.setPrice(pe.getPrice());
		p.setCategoryid(pe.getCategoryid());
		
		return p;
		
	}
	
	public List getAllProduct(){
		return productRepository.findAll();
	}
	
	public List updateProduct(int myid, Product p) {
		// TODO Auto-generated method stub
		ProductEntity pe = new ProductEntity();
		pe.setId(myid);
		pe.setName(p.getName());
		pe.setCategoryid(p.getCategoryid());
		pe.setPrice(p.getPrice());
		
		productRepository.saveAndFlush(pe);
		return productRepository.findAll();
	}


}

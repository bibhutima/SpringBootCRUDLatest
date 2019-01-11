package com.springboot.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.dao.ProductDAO;
import com.springboot.main.entity.ProductEntity;
import com.springboot.main.pojo.Product;

@Service("productService")
public class ProductService {
	
	@Autowired
	ProductDAO productDao;

	@Transactional
	public List<ProductEntity> addProduct(Product p) {
		// TODO Auto-generated method stub
		return productDao.addProduct(p);
	}

	@Transactional
	public List<ProductEntity> deleteProduct(Product p) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(p);
	}
	
	@Transactional
	public Product getProductById(int id){
		return productDao.getProductById(id);
	}
	
	@Transactional
	public List getAllProduct(){
		return productDao.getAllProduct();
		
	}
	@Transactional
	public List updateProduct(int myid, Product p) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(myid, p);
	}

}

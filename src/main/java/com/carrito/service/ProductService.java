package com.carrito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.carrito.converter.ProductConverter;
import com.carrito.entity.ProductEntity;
import com.carrito.repository.ProductRepository;
import com.carrito.model.ProductModel;

@Service("productService")
public class ProductService {
	private  String MSG = "La peticion salio bien";
	@Autowired
	@Qualifier("productRepository")
	private ProductRepository repository;
	
	@Autowired
	@Qualifier("productConverter")
	private ProductConverter converter;
	
	public String create(ProductEntity productEntity) {
		 try {
			 repository.save(productEntity);
			 return this.MSG;
		 }catch(Exception e) {
			 throw e;
		 }
	}
	public String update(ProductEntity productEntity) {
		 try {
			 repository.save(productEntity);
			 return this.MSG;
		 }catch(Exception e) {
			 throw e;
		 }
	}
	public String delete(String name, long id) {
		 try {
			ProductEntity product =  repository.findByNameAndId(name, id);
			repository.delete(product);
			 return this.MSG;
		 }catch(Exception e) {
			 throw e;
		 }
	}
	
	public List<ProductModel> getAll() {
		List<ProductModel> products;
		
		List<ProductEntity> productsEntity = repository.findAll();
		products = converter.convertList(productsEntity);
		return products;
	}
	
}

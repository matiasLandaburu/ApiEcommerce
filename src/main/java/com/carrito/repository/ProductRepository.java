package com.carrito.repository;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrito.entity.ProductEntity;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<ProductEntity, Serializable>{
	
	public abstract ProductEntity findByName (String name);
	
	public abstract List<ProductEntity> findAll ();
	
	public abstract ProductEntity findByNameAndId (String name, long id);
}

package com.carrito.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrito.entity.CartEntity;


@Repository("cartRepository")
public interface CartRepository  extends JpaRepository<CartEntity, Serializable>{
	
	public abstract List<CartEntity> findAll ();
	public abstract CartEntity findById (long id);
	

}

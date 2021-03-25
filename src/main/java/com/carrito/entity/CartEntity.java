package com.carrito.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.carrito.model.ProductModel;

@Table(name="cart")
@Entity
public class CartEntity implements Serializable {
	@GeneratedValue
	@Id
	@Column
	private long id;
	
	@OneToOne
	@JoinColumn
	private ProductEntity product;
	
	public CartEntity() {

	}


	public CartEntity(long id, ProductEntity product) {
		super();
		this.id = id;
		this.product = product;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public ProductEntity getProduct() {
		return product;
	}


	public void setProduct(ProductEntity product) {
		this.product = product;
	}




	
	
	
	
}

package com.carrito.model;

import com.carrito.entity.ProductEntity;

public class ProductModel {
	private long id;
	private String name;
	private String description;
	private String img;
	private long price;
	
	public ProductModel(ProductEntity productEntity) {
		this.id = productEntity.getId();
		this.name = productEntity.getName();
		this.description = productEntity.getDescription();
		this.img = productEntity.getImg();
		this.price = productEntity.getPrice();
		
	}
	public ProductModel(long id, String name, String descriptions, String img, long price) {
		super();
		this.id = id;
		this.name = name;
		this.description = descriptions;
		this.img = img;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	

}

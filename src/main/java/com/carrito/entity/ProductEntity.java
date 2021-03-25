package com.carrito.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Products")
@Entity
public class ProductEntity implements Serializable {
	@GeneratedValue
	@Id
	@Column
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String img;
	
	@Column
	private long price;
	
	public ProductEntity() {

	}

	public ProductEntity(long id, String name, String description, String img, long price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

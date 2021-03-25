package com.carrito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Users")
@Entity
public class UserEntity {
	@GeneratedValue
	@Id
	@Column
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String lastName;
	
	@Column
	private long spendMoney;
	
	@Column
	private String mail;
	
	

	public UserEntity() {

	}
	public UserEntity(long id, String name, String lastName, long spendMoney, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.spendMoney = spendMoney;
		this.mail = mail;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getSpendMoney() {
		return spendMoney;
	}

	public void setSpendMoney(long spendMoney) {
		this.spendMoney = spendMoney;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}

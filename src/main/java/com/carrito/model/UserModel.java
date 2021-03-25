package com.carrito.model;

import com.carrito.entity.UserEntity;

public class UserModel {
	private long id;
	private String name;
	private String lastName;
	private long spendMoney;
	private String mail;
	
	
	public UserModel(UserEntity user) {
		super();
		this.id = user.getId();
		this.name = user.getName();
		this.lastName = user.getLastName();
		this.spendMoney = user.getSpendMoney();
		this.mail = user.getMail();
	}
	public UserModel(long id, String name, String lastName, long spendMoney, String mail) {
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

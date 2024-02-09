package com.jsp.hibernate_acc;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
private int id;
private String name;
private double totalprice;
@OneToOne
public Account account;

@OneToMany
private List<Item> item;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public List<Item> getItem() {
	return item;
}

public void setItem(List<Item> item) {
	this.item = item;
}

public double getTotalprice() {
	return totalprice;
}

public void setTotalprice(double totalprice) {
	this.totalprice = totalprice;
}



}


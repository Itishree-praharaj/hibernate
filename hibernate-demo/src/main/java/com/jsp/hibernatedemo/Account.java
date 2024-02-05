package com.jsp.hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
private int id;
private String name;
private long mobilenum;
private long accountnum;
private int pincode;
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
public long getMobilenum() {
	return mobilenum;
}
public void setMobilenum(long mobilenum) {
	this.mobilenum = mobilenum;
}
public long getAccountnum() {
	return accountnum;
}
public void setAccountnum(long accountnum) {
	this.accountnum = accountnum;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}

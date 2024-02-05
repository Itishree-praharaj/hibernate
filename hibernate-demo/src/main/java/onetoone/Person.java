package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import cascading.Adhar;

@Entity
public class Person {
	@Id
private int id;
	@Column(nullable=false)
private String name;
private int age;
private long mobilenum;
@OneToOne
private Pan pan;
public Pan getPan() {
	return pan;
}
public void setPan(Pan pan) {
	this.pan = pan;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getMobilenum() {
	return mobilenum;
}
public void setMobilenum(long mobilenum) {
	this.mobilenum = mobilenum;
}

	
}


package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Branch {
	@Id
private int id;
private String name;
private String manager;

@ManyToOne
private Hospital hospital;

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

public String getManager() {
	return manager;
}

public void setManager(String manager) {
	this.manager = manager;
}

public Hospital getHospital() {
	return hospital;
}

public void setHospital(Hospital hospital) {
	this.hospital = hospital;
}




}

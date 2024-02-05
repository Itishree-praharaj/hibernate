package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Company {
	@Id
private int id;
private String name;
private String ceo;
@OneToMany
private List<Employee> employees;
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
public String getCeo() {
	return ceo;
}
public void setCeo(String ceo) {
	this.ceo = ceo;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}


}

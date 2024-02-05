package manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="countries")
public class Country {
	@Id
private int id;
	@Column(unique=true)
private String name;
private String population;
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
public String getPopulation() {
	return population;
}
public void setPopulation(String population) {
	this.population = population;
}


}

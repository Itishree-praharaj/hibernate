package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Students {
	@Id
private int id;
private String name;
@ManyToMany
private List<Course> courses;
private int yop;

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
public List<Course> getCourses() {
	return courses;
}
public void setCourses(List<Course> courses) {
	this.courses = courses;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}


}

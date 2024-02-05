package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
 private int id;
 private String panno;
 private String address;
 @OneToOne
 private Person person;
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPanno() {
	return panno;
}
public void setPanno(String panno) {
	this.panno = panno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

	
}
 


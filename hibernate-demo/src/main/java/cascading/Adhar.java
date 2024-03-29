package cascading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private long aadharnum;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getAadharnum() {
	return aadharnum;
}
public void setAadharnum(long aadharnum) {
	this.aadharnum = aadharnum;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}

package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person p1 = new Person();
	p1.setId(1);
	p1.setName("itishree");
	p1.setAge(21);
	p1.setMobilenum(345678456);
	
	Pan pan = new Pan();
	pan.setId(1);
	pan.setPanno("ABCD123DF");
	pan.setAddress("Banglore");
	
	p1.setPan(pan);
	pan.setPerson(p1);
	
	et.begin();
	em.persist(p1);
	em.persist(pan);
	et.commit();
}
}

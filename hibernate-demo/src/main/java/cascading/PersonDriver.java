package cascading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class PersonDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person1 person1 = new Person1();
	person1.setName("A");
	person1.setAge(10);
	
	Adhar adhar = new Adhar();
	adhar.setAadharnum(1234567890);
	adhar.setAddress("marathahali");
	
	person1.setAadharacard(adhar);
	
	et.begin();
	em.persist(person1);
	et.commit();
}
}

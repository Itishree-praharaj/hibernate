   package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	State state1 = new State();
	state1.setId(1);
	state1.setName("karnatak");
	state1.setCm("siddaramaiah");
	
	State state2 = new State();
	state2.setId(2);
	state2.setName("odisha");
	state2.setCm("Naveen pattnaik");
	
	State state3 = new State();
	state3.setId(3);
	state3.setName("Ap");
	state3.setCm("jagan");
	
	State state4 = new State();
	state4.setId(4);
	state4.setName("mp");
	state4.setCm("shivaj");
	
	Country country = new Country();
	country.setId(1);
	country.setName("India");
	country.setPopulation("140 cores");
	
	state1.setCountry(country);
	state2.setCountry(country);
	state3.setCountry(country);
	state4.setCountry(country);
	
	et.begin();
	em.persist(country);
	em.persist(state1);
	em.persist(state2);
	em.persist(state3);
	em.persist(state4);
	et.commit();
	
	
}
}

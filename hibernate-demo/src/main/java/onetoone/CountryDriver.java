package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	 Country c1 = new Country();
	 c1.setId(1);
	 c1.setName("india");
	 c1.setCapital("delhi");
	 
	 PrimeMinister m1 = new PrimeMinister();
	 m1.setId(1);
	 m1.setName("itishree");
	 m1.setAge(23);
	 
	 Country c2= new Country();
	 c2.setId(2);
	 c2.setName("nepal");
	 c2.setCapital("nep");
	 
	 PrimeMinister m2 = new PrimeMinister();
	 m2.setId(2);
	 m2.setName("shree");
	 m2.setAge(22);
	 
	 
	 c1.setPrimemister(m1);
	 c2.setPrimemister(m2);
	 
	 
	 et.begin();
	 em.persist(c1);
	 em.persist(c2);
	 em.persist(m1);
	 em.persist(m2);
	 et.commit();
}	
}

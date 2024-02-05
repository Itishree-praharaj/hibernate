package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
		EntityManager em = emf.createEntityManager();
		
		Country c = em.find(Country.class, 1);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getCapital());
		
		System.out.println("=========== Prime minister details ============");
		PrimeMinister pm = c.getPrimemister();
		System.out.println(pm.getId());
		System.out.println(pm.getName());
		System.out.println(pm.getAge());
	}

}

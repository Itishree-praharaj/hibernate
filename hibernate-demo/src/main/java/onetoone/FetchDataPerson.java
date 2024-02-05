package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDataPerson {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
		EntityManager em = emf.createEntityManager();
		
		Person p1 = em.find(Person.class, 1);
		System.out.println(p1.getId());
		System.out.println(p1.getName());  
		System.out.println(p1.getAge());
		System.out.println(p1.getMobilenum());
		
		System.out.println("=========== pan details ============");
		Pan pan = p1.getPan();
		System.out.println(pan.getId());
		System.out.println(pan.getPanno());
		System.out.println(pan.getAddress());

	}

}

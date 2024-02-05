package onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class FetchDataCompany {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	
	Company c = em.find(Company.class, 1);
	System.out.println(c.getId());
	System.out.println(c.getName());  
	System.out.println(c.getCeo());

	
	System.out.println("===========  details ============");
	
	List<Employee> employees = c.getEmployees();
	for(Employee e: employees) {
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getRole());

}
}
}

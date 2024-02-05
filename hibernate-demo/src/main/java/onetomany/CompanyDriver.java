package onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {
	public static void main(String[] args, Object employee2) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
EntityManager em = emf.createEntityManager();
EntityTransaction et = em.getTransaction();

Company company = new Company();
company.setId(1);
company.setName("itishree solution");
company.setCeo("itishree");

Employee employee1 = new Employee();
employee1.setId(1);
employee1.setName("shree");
employee1.setRole("dev");

Employee employee = new Employee();
employee.setId(2);
employee.setName("shreeya");
employee.setRole("designer");

ArrayList<Employee> employees = new ArrayList<Employee>();
employees.add(employee1);
employees.add(employee);

company.setEmployees(employees);

et.begin();
em.persist(company);
em.persist(employee1);
em.persist(employee);
et.commit();
	}
}

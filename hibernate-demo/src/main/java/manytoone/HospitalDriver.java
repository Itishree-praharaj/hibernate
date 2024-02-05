package manytoone;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {
	public static void main(String[] args) {
		
	
EntityManagerFactory factory = Persistence.createEntityManagerFactory("itishree");
EntityManager manager = factory.createEntityManager();
EntityTransaction transaction = manager.getTransaction();

Hospital hospital = new Hospital();
hospital.setId(1);
hospital.setName("Appollo");
hospital.setCeo("Itishree");

Branch  branch1 = new Branch();
branch1.setId(1);
branch1.setName("BTM");
branch1.setManager("A");

Branch  branch2 = new Branch();
branch2.setId(2);
branch2.setName("marathahali");
branch2.setManager("B");

Branch  branch3 = new Branch();
branch3.setId(3);
branch3.setName("sarjapur ");
branch3.setManager("C");


branch1.setHospital(hospital);
branch2.setHospital(hospital);
branch3.setHospital(hospital);

List<Branch> branches = new ArrayList<Branch>();
branches.add(branch1);
branches.add(branch2);
branches.add(branch3);
 
hospital.setBranch(branches);

transaction.begin();
manager.persist(hospital);
manager.persist(branch1);
manager.persist(branch2);
manager.persist(branch3);
transaction.commit();


}
}
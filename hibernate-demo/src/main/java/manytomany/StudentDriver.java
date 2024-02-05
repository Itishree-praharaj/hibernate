package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
EntityManager em = emf.createEntityManager();
EntityTransaction et = em.getTransaction();

Students s1 = new Students();
s1.setId(1);
s1.setName("A");
s1.setYop(2023);


Students s2 = new Students();
s2.setId(2);
s2.setName("B");
s2.setYop(2022); 


Students s3 = new Students();
s3.setId(3);
s3.setName("C");
s3.setYop(2024);


Course c1 = new Course();
c1.setId(1);
c1.setName("java");
c1.setDuration("6 months");

Course c2 = new Course();
c2.setId(2);
c2.setName("python");
c2.setDuration("6 months");

Course c3 = new Course();
c3.setId(3);
c3.setName("sql");
c3.setDuration("6 months");

List<Course> courses = new ArrayList<Course>();
courses.add(c1);
courses.add(c2);
courses.add(c3);


List<Students> students = new ArrayList<Students>();
students.add(s1);
students.add(s2);
students.add(s3);

c1.setStudents(students);
c2.setStudents(students);
c2.setStudents(students);

s1.setCourses(courses);
s2.setCourses(courses);
s3.setCourses(courses);

et.begin();
em.persist(s1);
em.persist(s2);
em.persist(s3);
em.persist(c1);
em.persist(c2);
em.persist(c3);
et.commit();
}
}
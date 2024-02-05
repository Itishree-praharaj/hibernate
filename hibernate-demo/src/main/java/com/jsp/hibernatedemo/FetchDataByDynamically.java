package com.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDataByDynamically {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");	
	EntityManager em = emf.createEntityManager();
	
	Scanner scn = new Scanner(System.in);
	System.out.println("enter id");
	int id = scn.nextInt();
	
	Student s = em.find(Student.class, id);
	if(s!=null) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
	else {
		System.out.println("invalid id");
	}
}
}

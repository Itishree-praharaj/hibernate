package com.jsp.hibernatedemo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstablishConnection {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
		System.out.println("connection established");
	}
}

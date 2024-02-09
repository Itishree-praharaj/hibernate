package com.jsp.hibernate_acc;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("itishree");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Account a = new Account();
	a.setId(1);
	a.setName("itishree");
	a.setEmail("itishree@gmail.com");
	a.setPassword("iti123");
	
	Cart c = new Cart();
	c.setId(1);
	c.setName("products");
	c.setTotalprice(10000.00);
	
	Item i1 = new Item();
	i1.setId(1);
	i1.setName("iphone");
	i1.setPrice(40000.00);
	
	Item i2 = new Item();
	i2.setId(2);
	i2.setName("laptop");
	i2.setPrice(50000.00);
	
	List<Item> items = new ArrayList<Item>();
	items.add(i1);
	items.add(i2);
	
	i1.setCart(c);
	i2.setCart(c);
	
	c.setItem(items);
	c.setTotalprice(40000.00+50000.00);
	c.setAccount(a);
	
	a.setCart(c);
	
	et.begin();
	em.persist(a);
	em.persist(c);
	em.persist(i1);
	em.persist(i2);
	et.commit();
	
}
}

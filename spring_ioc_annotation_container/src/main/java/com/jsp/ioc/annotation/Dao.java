package com.jsp.ioc.annotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
private EntityManager manager = factory.createEntityManager();
private EntityTransaction transaction = manager.getTransaction();

public void savePen(Pen pen1) {
	transaction.begin();
	manager.persist(pen1);
	transaction.commit();
}
}

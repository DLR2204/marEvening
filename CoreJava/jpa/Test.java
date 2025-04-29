package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("Table is created successfully");
		
		em.getTransaction().commit();
		
		em.close();
		
	}

}

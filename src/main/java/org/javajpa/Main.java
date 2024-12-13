package org.javajpa;

import org.javajpa.domain.People;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

            People p1 = new People(null,"Carlos da Silva", "carlos@gmail.com");
            People p2 = new People(null,"Joaquim Torres", "joaquim@gmail.com");
            People p3 = new People(null,"Ana Maria", "maria@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        em.close();
        emf.close();
        }
    }

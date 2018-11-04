package com.siksmfp.play.hibernate.hello;

import com.siksmfp.play.hibernate.hello.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        User user = new User();
        user.setName("new");
        user.setSecondName("new");

        em.persist(user);
        em.getTransaction().commit();
        em.close();

        System.out.println("Finish");
        emf.close();
    }
}
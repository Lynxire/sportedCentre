package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateConnection;
//import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.User;
import by.teachmeskills.repository.UserRepositoryInterface;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
@RequiredArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepositoryInterface {

    private final SessionFactory sessionFactory;


    @Override
    public void add(User user) {

        EntityManager entityManager = HibernateConnection.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new RuntimeException(e);
        }

        entityManager.close();
    }

    @Override
    public User findById(Long id) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;


    }

    @Override
    public void deleteById(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.remove(user);
        session.getTransaction().commit();
        session.close();

    }


}

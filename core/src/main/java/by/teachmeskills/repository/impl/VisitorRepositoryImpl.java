package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Visitor;
import by.teachmeskills.repository.VisitorRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class VisitorRepositoryImpl implements VisitorRepositoryInterface {
    private final SessionFactory  sessionFactory;

    public VisitorRepositoryImpl() {
        sessionFactory = HibernateJavaConfig.getSessionFactory();
    }

    @Override
    public void add(Visitor visitor) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(visitor);
        session.getTransaction().commit();
        session.close();
    }
}

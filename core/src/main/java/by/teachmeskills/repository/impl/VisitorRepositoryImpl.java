package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Visitor;
import by.teachmeskills.repository.VisitorRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

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

    @Override
    public Visitor visitorByName(String name) {
        Session session = sessionFactory.openSession();
        Query<Visitor> query = session.createQuery("select v from Visitor v where name =: visitorName", Visitor.class);
        query.setParameter("visitorName", name);
        List<Visitor> list = query.list();
        Visitor visitor = list.getFirst();
        return visitor;


    }
}

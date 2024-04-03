package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Service;
import by.teachmeskills.repository.ServiceRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ServiceRepositoryImpl implements ServiceRepositoryInterface {
    private SessionFactory sessionFactory;
    public ServiceRepositoryImpl(){
        sessionFactory = HibernateJavaConfig.getSessionFactory();
    }
    @Override
    public void add(Service service) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(service);
        session.getTransaction().commit();
        session.close();
    }
}

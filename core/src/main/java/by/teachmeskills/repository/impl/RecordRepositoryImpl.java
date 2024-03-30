package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Record;
import by.teachmeskills.repository.RecordRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RecordRepositoryImpl implements RecordRepositoryInterface {
    private final SessionFactory sessionFactory;

    public RecordRepositoryImpl(){
        sessionFactory = HibernateJavaConfig.getSessionFactory();
    }
    @Override
    public void add(Record record) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(record);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Record record = session.get(Record.class, id);
        session.remove(record);
        session.getTransaction().commit();
        session.close();
    }
}

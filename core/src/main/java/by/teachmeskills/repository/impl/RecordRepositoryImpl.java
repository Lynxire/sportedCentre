package by.teachmeskills.repository.impl;

//import by.teachmeskills.config.hibernate.HibernateJavaConfig;

import by.teachmeskills.entity.Record;
import by.teachmeskills.repository.RecordRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecordRepositoryImpl implements RecordRepositoryInterface {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void add(Record record) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(record);
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

package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Room;
import by.teachmeskills.repository.PremisesRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PremisesRepositoryImpl implements PremisesRepositoryInterface {

    private final SessionFactory sessionFactory;
    public PremisesRepositoryImpl(){
        sessionFactory = HibernateJavaConfig.getSessionFactory();
    }
    @Override
    public void add(Room room) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(room);
//        session.createQuery("select p From premises p where l", Premises.class);
    }
}

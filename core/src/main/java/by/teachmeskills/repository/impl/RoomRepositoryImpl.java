package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Room;
import by.teachmeskills.repository.RoomRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RoomRepositoryImpl implements RoomRepositoryInterface {

    private final SessionFactory sessionFactory;
    public RoomRepositoryImpl(){
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

package by.teachmeskills.repository.impl;

//import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Service;
import by.teachmeskills.repository.ServiceRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ServiceRepositoryImpl implements ServiceRepositoryInterface {
    private final SessionFactory sessionFactory;

    @Override
    public void add(Service service) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(service);
        session.getTransaction().commit();
        session.close();
    }
}

package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Employee;
import by.teachmeskills.entity.User;
import by.teachmeskills.repository.EmployeeRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeRepositoryImpl implements EmployeeRepositoryInterface {
    private SessionFactory sessionFactory;
    public EmployeeRepositoryImpl(){
        sessionFactory = HibernateJavaConfig.getSessionFactory();
    }
    @Override
    public void add(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
        session.close();
    }
}

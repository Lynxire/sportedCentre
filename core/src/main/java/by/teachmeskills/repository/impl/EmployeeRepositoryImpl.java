package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Employee;
import by.teachmeskills.entity.User;
import by.teachmeskills.repository.EmployeeRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

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

    @Override
    public Employee findEmployeeWithMaxSalary() {
        Session session = sessionFactory.openSession();
        Query<Employee> query = session.createQuery("select e from Employee e where salary = (SELECT max(ee.salary) from Employee ee)", Employee.class);
        List<Employee> list = query.list();
        Employee first = list.getFirst();
        return first;

    }
}

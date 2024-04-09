package by.teachmeskills.repository.impl;

//import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Employee;
import by.teachmeskills.entity.User;
import by.teachmeskills.repository.EmployeeRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class EmployeeRepositoryImpl implements EmployeeRepositoryInterface {
    private SessionFactory sessionFactory;

    @Autowired
    public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
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

    @Override
    public Employee findEmployeeWithMinSalary() {
        Session session = sessionFactory.openSession();
        Query<Employee> query = session.createQuery("select e from Employee e where salary = (SELECT min(ee.salary) from Employee ee)", Employee.class);
        List<Employee> list = query.list();
        Employee first = list.getFirst();
        return first;
    }
}

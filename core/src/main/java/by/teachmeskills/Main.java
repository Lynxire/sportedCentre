package by.teachmeskills;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.service.UserService;
import by.teachmeskills.service.VisitorService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        VisitorService visitorService = new VisitorService();
        Visitor user = new Visitor(new BigDecimal(100L));
        visitorService.add(user);
//           SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
//            sessionFactory.openSession();
//            sessionFactory.close();
    }
}
package by.teachmeskills;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.User;
import by.teachmeskills.entity.UserStatus;
import by.teachmeskills.entity.Visitor;
import by.teachmeskills.service.UserService;
import by.teachmeskills.service.VisitorService;
import org.hibernate.SessionFactory;

import java.math.BigDecimal;
import java.time.LocalDate;

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
package by.teachmeskills.repository.impl;

import by.teachmeskills.config.hibernate.HibernateJavaConfig;
import by.teachmeskills.entity.Room;
import by.teachmeskills.repository.RoomRepositoryInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

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
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Long RevenueForPeriodById( String beginPeriod, String endPeriod) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//convert String to LocalDate
        LocalDate beginPeriodDate = LocalDate.parse(beginPeriod, formatter);
        LocalDate endPeriodDate = LocalDate.parse(endPeriod, formatter);

        Session session = sessionFactory.openSession();
        Query<Long> query = session.createQuery("select r.priceByHour from Room r");
        List<Long> priceByHour = query.getResultList();
        long days = ChronoUnit.DAYS.between(beginPeriodDate,endPeriodDate);
        Long k = 0L;
        for (int i = 0; i < priceByHour.size(); i++) {
            k = k + priceByHour.get(i);
        }
        Long revenue = days * 24 * k;
        return revenue;
    }
}

package by.teachmeskills;

import by.teachmeskills.entity.*;
import by.teachmeskills.entity.Record;
import by.teachmeskills.entity.status.RoomStatus;
import by.teachmeskills.entity.status.UserStatus;
import by.teachmeskills.repository.*;
import by.teachmeskills.repository.impl.*;
import by.teachmeskills.service.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User(null, "yara", "smit", LocalDate.of(1914, 6, 29), "San-Francisco");
        userService.add(user);

        VisitorService visitorService = new VisitorService();
        Visitor visitor = new Visitor(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 04, 01), UserStatus.BLOCKED, new BigDecimal(1000L));
        visitorService.add(visitor);

        EmployeeService employeeService = new EmployeeService();
        Employee director = new Employee(LocalDate.of(2005, 06, 05), LocalDate.of(2010, 05, 10), "Director", new BigDecimal(3000L));
        employeeService.add(director);

        Service_EntityService entityService = new Service_EntityService();
        Service basketball = new Service(null, "Basketball", 10L);
        entityService.add(basketball);

        RoomService roomService = new RoomService();
        Room basketClub = new Room(null, "BasketClub", 510L, 20L, RoomStatus.ACTIVE, 4L,basketball);
        roomService.add(basketClub);
        RecordService recordService = new RecordService();

        Record record = new Record(null, LocalDate.now(), LocalTime.now(),user,basketClub);
        recordService.add(record);


    }
}
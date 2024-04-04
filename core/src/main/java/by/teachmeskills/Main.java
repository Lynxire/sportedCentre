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

//
//
        VisitorService visitorService = new VisitorService();
//        Visitor visitor = new Visitor();
//        visitor.setId(null);
//        visitor.setName("yara");
//        visitor.setSurname("smit");
//        visitor.setBirthday(LocalDate.now());
//        visitor.setAddress("Minsk");
//        visitor.setFirsVisitDate(LocalDate.of(2024,01,01));
//        visitor.setLastVisitDate(LocalDate.of(2024,04,04));
//        visitor.setUserStatus(UserStatus.ACTIVED);
//        visitor.setSpentAmount(new BigDecimal(1000L));
//        visitorService.add(visitor);
//
//        Service_EntityService entityService = new Service_EntityService();
//        Service basketball = new Service(null, "Basketball", 10L);
//        entityService.add(basketball);
//
//        RoomService roomService = new RoomService();
//        Room basketClub = new Room(null, "BasketClub", 510L, 20L, RoomStatus.ACTIVE, 4L,basketball);
//        roomService.add(basketClub);
//
//        RecordService recordService = new RecordService();
//        Record record = new Record(null, LocalDate.now(), LocalTime.now(),visitor,basketClub);
//        recordService.add(record);

        System.out.println(visitorService.findByName("yara"));
    }
}
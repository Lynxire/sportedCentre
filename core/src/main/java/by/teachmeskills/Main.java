package by.teachmeskills;

import by.teachmeskills.entity.*;
import by.teachmeskills.entity.Record;
import by.teachmeskills.entity.status.RoomStatus;
import by.teachmeskills.entity.status.UserStatus;
import by.teachmeskills.repository.*;
import by.teachmeskills.repository.impl.*;
import by.teachmeskills.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@Configuration
@ComponentScan("by.teachmeskills")
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (Main.class);
        UserService userService = ctx.getBean("userService", UserService.class);
        System.out.println(userService.findById(1L));

    }
}
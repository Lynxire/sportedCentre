package by.teachmeskills;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("by.teachmeskills")
public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext
//                (Main.class);
//        UserService userService = ctx.getBean("userService", UserService.class);
//        SalesService salesService = ctx.getBean("salesService", SalesService.class);
//        RecordService recordService= ctx.getBean("recordService", RecordService.class);
//        VisitorService visitorService = ctx.getBean("visitorService", VisitorService.class);
//        Visitor visitor = new Visitor();
//        visitor.setId(1L);
//        visitor.setName("Visitor");
//        visitor.setAddress("1");
//        visitor.setUserStatus(UserStatus.ACTIVED);
//        visitorService.add(visitor);


//        Record record=new Record();
//        record.setDate(LocalDate.now());
//        record.setTime(LocalTime.now());
//        recordService.add(record);
//        Sales sales = new Sales();
//        sales.setValue(new BigDecimal(15L));
//        sales.setBeginDate(LocalDate.now());
//        sales.setEndDate(LocalDate.of(2024,04,12));
//        sales.setUserStatus(UserStatus.ACTIVED);
//        salesService.save(sales);

    }
}
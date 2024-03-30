package by.teachmeskills;

import by.teachmeskills.entity.Record;
import by.teachmeskills.entity.User;
import by.teachmeskills.entity.Visitor;
import by.teachmeskills.repository.RecordRepositoryInterface;
import by.teachmeskills.repository.UserRepositoryInterface;
import by.teachmeskills.repository.impl.RecordRepositoryImpl;
import by.teachmeskills.repository.impl.UserRepositoryImpl;
import by.teachmeskills.service.UserService;
import by.teachmeskills.service.VisitorService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        RecordRepositoryInterface recordRepository = new RecordRepositoryImpl();
        UserRepositoryInterface repositoryInterface = new UserRepositoryImpl();
        Record record = new Record();
        User user = new User();
        repositoryInterface.add(user);
        record.setUser(user);
        recordRepository.add(record);
//        recordRepository.deleteById(152L);

    }
}
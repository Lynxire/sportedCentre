package by.teachmeskills.service;

import by.teachmeskills.entity.Record;
import by.teachmeskills.repository.RecordRepositoryInterface;
import by.teachmeskills.repository.impl.RecordRepositoryImpl;

public class RecordService {
    public void add(Record record){
        RecordRepositoryInterface recordRepository = new RecordRepositoryImpl();
        recordRepository.add(record);
    }
}

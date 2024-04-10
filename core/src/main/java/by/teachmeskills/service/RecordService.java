package by.teachmeskills.service;

import by.teachmeskills.entity.Record;
import by.teachmeskills.repository.RecordRepositoryInterface;
import by.teachmeskills.repository.impl.RecordRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RecordService {
    private RecordRepositoryInterface recordRepositoryInterface;

    public void add(Record record) {
        recordRepositoryInterface.add(record);
    }
}

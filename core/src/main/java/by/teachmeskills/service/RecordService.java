package by.teachmeskills.service;

import by.teachmeskills.entity.Record;
import by.teachmeskills.repository.hibbernate.RecordRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RecordService {

    private final RecordRepositoryInterface recordRepositoryInterface;

    public void add(Record record) {
        recordRepositoryInterface.add(record);
    }
}

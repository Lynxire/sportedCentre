package by.teachmeskills.repository;

import by.teachmeskills.entity.Record;

public interface RecordRepositoryInterface{
    public void add(Record record);
    public void deleteById(Long id);
}

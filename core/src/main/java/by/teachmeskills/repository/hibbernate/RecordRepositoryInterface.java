package by.teachmeskills.repository.hibbernate;

import by.teachmeskills.entity.Record;

public interface RecordRepositoryInterface{
    public void add(Record record);
    public void deleteById(Long id);
}

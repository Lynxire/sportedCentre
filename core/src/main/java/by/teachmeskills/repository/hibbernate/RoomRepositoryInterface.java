package by.teachmeskills.repository.hibbernate;

import by.teachmeskills.entity.Room;

public interface RoomRepositoryInterface {
    public void add(Room room);
    public Long RevenueForPeriodById(String beginPeriod, String endPeriod);
}

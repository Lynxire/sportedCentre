package by.teachmeskills.service;

import by.teachmeskills.entity.Room;
import by.teachmeskills.repository.RoomRepositoryInterface;
import by.teachmeskills.repository.impl.RoomRepositoryImpl;

public class RoomService {
    public void add(Room room){
        RoomRepositoryInterface roomRepositoryInterface = new RoomRepositoryImpl();
        roomRepositoryInterface.add(room);
    }
}

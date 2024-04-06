package by.teachmeskills.service;

import by.teachmeskills.entity.Room;
import by.teachmeskills.repository.RoomRepositoryInterface;
import by.teachmeskills.repository.impl.RoomRepositoryImpl;

public class RoomService {
    private RoomRepositoryInterface roomRepositoryInterface;

    public RoomService(){
        roomRepositoryInterface = new RoomRepositoryImpl();
    }

    public void add(Room room){
        roomRepositoryInterface.add(room);
    }

}

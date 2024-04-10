package by.teachmeskills.service;

import by.teachmeskills.entity.Room;
import by.teachmeskills.repository.RoomRepositoryInterface;
import by.teachmeskills.repository.impl.RoomRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private RoomRepositoryInterface roomRepositoryInterface;

    @Autowired
    public RoomService(RoomRepositoryInterface roomRepositoryInterface) {
        this.roomRepositoryInterface = roomRepositoryInterface;
    }

    public void add(Room room){
        roomRepositoryInterface.add(room);
    }

}

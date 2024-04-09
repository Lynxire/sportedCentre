package by.teachmeskills.service;

import by.teachmeskills.entity.Service;
import by.teachmeskills.repository.ServiceRepositoryInterface;
import by.teachmeskills.repository.impl.ServiceRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service_EntityService {
    private final ServiceRepositoryInterface serviceRepositoryInterface;

    public void add(Service service){
        serviceRepositoryInterface.add(service);
    }
}

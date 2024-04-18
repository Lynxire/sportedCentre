package by.teachmeskills.service;

import by.teachmeskills.entity.Service;
import by.teachmeskills.repository.hibbernate.ServiceRepositoryInterface;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service_EntityService {
    private final ServiceRepositoryInterface serviceRepositoryInterface;

    public void add(Service service){
        serviceRepositoryInterface.add(service);
    }
}

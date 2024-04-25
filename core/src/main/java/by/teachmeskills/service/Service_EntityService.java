package by.teachmeskills.service;

import by.teachmeskills.entity.Service;
import by.teachmeskills.repository.ServiceRepository;
import by.teachmeskills.repository.hibbernate.ServiceRepositoryInterface;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service_EntityService {
    private final ServiceRepository  serviceRepository;

    public void add(Service service){
        serviceRepository.save(service);
    }
}

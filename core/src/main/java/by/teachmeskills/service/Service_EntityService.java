package by.teachmeskills.service;

import by.teachmeskills.entity.Service;
import by.teachmeskills.repository.ServiceRepositoryInterface;
import by.teachmeskills.repository.impl.ServiceRepositoryImpl;

public class Service_EntityService {
    public void add(Service service){
        ServiceRepositoryInterface serviceRepositoryInterface = new ServiceRepositoryImpl();
        serviceRepositoryInterface.add(service);
    }
}

package by.teachmeskills.service;

import by.teachmeskills.api.service.ServiceRequest;
import by.teachmeskills.api.service.ServiceResponse;
import by.teachmeskills.entity.Service;
import by.teachmeskills.loggerAOP.LoggingAnnotation;
import by.teachmeskills.mapper.ServiceMapper;
import by.teachmeskills.repository.ServiceRepository;
import by.teachmeskills.repository.hibbernate.ServiceRepositoryInterface;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service_EntityService {
    private final ServiceRepository  serviceRepository;
    private final ServiceMapper mapper;
    @LoggingAnnotation
    public ServiceResponse save(ServiceRequest serviceRequest){
        Service entity = mapper.toEntity(serviceRequest);
        serviceRepository.save(entity);
        return mapper.toResponse(entity);
    }
}

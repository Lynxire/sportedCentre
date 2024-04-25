package by.teachmeskills.mapper;

import by.teachmeskills.api.service.ServiceRequest;
import by.teachmeskills.api.service.ServiceResponse;
import by.teachmeskills.entity.Service;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    Service toEntity(ServiceRequest serviceRequest);
    ServiceResponse toResponse(Service service);
}

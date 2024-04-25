package by.teachmeskills.controller;

import by.teachmeskills.api.service.ServiceRequest;
import by.teachmeskills.api.service.ServiceResponse;
import by.teachmeskills.entity.Service;
import by.teachmeskills.mapper.ServiceMapper;
import by.teachmeskills.service.Service_EntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("service")
public class ServiceController {
    private final Service_EntityService entityService;
    @PostMapping("/add")
    public ServiceResponse addService(@RequestBody ServiceRequest serviceRequest) {
        return entityService.save(serviceRequest);
    }



}

package by.teachmeskills.service;

import by.teachmeskills.entity.Sales;
import by.teachmeskills.repository.SalesRepositorySpring;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalesService {
    private final SalesRepositorySpring salesRepositorySpring;

    public Sales save(Sales sales){
        return salesRepositorySpring.save(sales);
    }
}

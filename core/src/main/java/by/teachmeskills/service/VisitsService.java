package by.teachmeskills.service;

import by.teachmeskills.entity.Visits;
import by.teachmeskills.repository.VisitsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VisitsService {
    private final VisitsRepository visitsRepository;

    public List<Visits> getAllVisits() {
        return visitsRepository.findAll();
    }
}

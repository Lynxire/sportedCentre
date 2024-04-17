package by.teachmeskills.service;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.entity.Visits;
import by.teachmeskills.entity.status.UserStatus;
import by.teachmeskills.repository.VisitorRepositoryInterface;
import by.teachmeskills.repository.VisitsRepository;
import by.teachmeskills.repository.impl.VisitorRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class VisitorService {
    private final VisitorRepositoryInterface visitorRepositoryInterface;
    private final VisitsRepository visitsRepository;


    public void add(Visitor visitor) {
        List<Visits> visitsByVisitor = visitsRepository.findVisitsByVisitorId(visitor.getId());
        if(visitsByVisitor.stream().count() > 10){
            visitor.setUserStatus(UserStatus.PREMIUM);
        }
        visitorRepositoryInterface.add(visitor);
    }

    public Visitor findByName(String name) {
        return visitorRepositoryInterface.visitorByName(name);
    }
}

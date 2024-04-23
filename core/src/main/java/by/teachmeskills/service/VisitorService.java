package by.teachmeskills.service;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.repository.hibbernate.VisitorRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VisitorService {
    private final VisitorRepositoryInterface visitorRepositoryInterface;

    public void add(Visitor visitor) {
        visitorRepositoryInterface.add(visitor);
    }

    public Visitor findByName(String name) {
        return visitorRepositoryInterface.visitorByName(name);
    }


}

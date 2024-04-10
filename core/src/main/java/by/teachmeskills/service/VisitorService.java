package by.teachmeskills.service;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.repository.VisitorRepositoryInterface;
import by.teachmeskills.repository.impl.VisitorRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {
    private VisitorRepositoryInterface visitorRepositoryInterface;

    @Autowired
    public VisitorService(VisitorRepositoryInterface visitorRepositoryInterface) {
        this.visitorRepositoryInterface = visitorRepositoryInterface;
    }

    public void add(Visitor visitor) {
        visitorRepositoryInterface.add(visitor);
    }

    public Visitor findByName(String name) {
        return visitorRepositoryInterface.visitorByName(name);
    }
}

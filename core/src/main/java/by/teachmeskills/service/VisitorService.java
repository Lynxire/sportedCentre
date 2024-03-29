package by.teachmeskills.service;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.repository.VisitorRepositoryInterface;
import by.teachmeskills.repository.impl.VisitorRepositoryImpl;

public class VisitorService {

    public void add(Visitor visitor){
        VisitorRepositoryInterface visitorRepositoryInterface = new VisitorRepositoryImpl();
        visitorRepositoryInterface.add(visitor);
    }
}

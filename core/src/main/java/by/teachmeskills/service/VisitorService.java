package by.teachmeskills.service;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.repository.VisitorRepositoryInterface;
import by.teachmeskills.repository.impl.VisitorRepositoryImpl;

public class VisitorService {
    private VisitorRepositoryInterface visitorRepositoryInterface;

    public VisitorService(){
        visitorRepositoryInterface = new VisitorRepositoryImpl();
    }

    public void add(Visitor visitor){
        visitorRepositoryInterface.add(visitor);
    }

    public Visitor findByName(String name){
        return visitorRepositoryInterface.visitorByName(name);
    }
}

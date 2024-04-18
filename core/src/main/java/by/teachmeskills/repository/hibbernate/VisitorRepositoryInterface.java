package by.teachmeskills.repository.hibbernate;

import by.teachmeskills.entity.Visitor;

public interface VisitorRepositoryInterface {
    public void add(Visitor visitor);
    public Visitor visitorByName(String name);
}

package by.teachmeskills.repository;

import by.teachmeskills.entity.Visitor;
import by.teachmeskills.entity.Visits;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitsRepository extends JpaRepository<Visits, Integer> {
    public List<Visits> findVisitsByVisitorId(Long visitorId);
}

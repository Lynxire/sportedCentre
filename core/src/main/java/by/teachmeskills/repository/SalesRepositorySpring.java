package by.teachmeskills.repository;

import by.teachmeskills.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
@Repository
public interface SalesRepositorySpring extends JpaRepository<Sales, Long> {
    public List<Sales> findAll();
    public Sales save(Sales sales);
}

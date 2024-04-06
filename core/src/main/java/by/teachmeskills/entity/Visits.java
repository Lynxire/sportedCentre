package by.teachmeskills.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Entity
@Table(schema = "test", name = "visits")
public class Visits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateVisits;
    private BigDecimal spentMoney;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

}

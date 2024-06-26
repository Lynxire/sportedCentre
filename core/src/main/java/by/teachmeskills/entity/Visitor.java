package by.teachmeskills.entity;

import by.teachmeskills.entity.status.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@Entity
@Table(schema = "test", name = "visitor")
@PrimaryKeyJoinColumn(name = "visitor_id")
public class Visitor extends User {
    @Column(name = "first_visit_date")
    private LocalDate firsVisitDate;
    @Column(name = "last_visit_date")
    private LocalDate lastVisitDate;
    @Column(name = "user_status")
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @Column(name = "spent_amount")
    private BigDecimal spentAmount;

}

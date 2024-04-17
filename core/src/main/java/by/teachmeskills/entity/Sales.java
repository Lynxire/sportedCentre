package by.teachmeskills.entity;

import by.teachmeskills.entity.status.UserStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(schema = "test", name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal value;
    @Column(name = "begin_date")
    private LocalDate beginDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

}

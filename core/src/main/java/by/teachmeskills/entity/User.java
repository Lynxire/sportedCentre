package by.teachmeskills.entity;

import by.teachmeskills.entity.status.UserStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(schema = "test", name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private Long number;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    private Long age;
    private BigDecimal sum;

}

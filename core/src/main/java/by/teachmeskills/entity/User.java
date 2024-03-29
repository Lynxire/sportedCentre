package by.teachmeskills.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "test", name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private Long number;
    private LocalDate  date;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    private Long age;
    private BigDecimal sum;

}

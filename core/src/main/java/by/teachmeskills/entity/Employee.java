package by.teachmeskills.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(schema = "test", name = "employee")
@PrimaryKeyJoinColumn(name = "employee_id")
public class Employee extends User {
    LocalDate dateBegin;
    LocalDate dateEnd;
    String post;
    Long salary;
}

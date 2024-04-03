package by.teachmeskills.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "test", name = "employee")
@PrimaryKeyJoinColumn(name = "employee_id")
public class Employee extends User {
    @Column(name = "date_begin_work")
    LocalDate dateBeginWork;
    @Column(name = "date_end_work")
    LocalDate dateEndWork;
    String post;
    BigDecimal salary;
}

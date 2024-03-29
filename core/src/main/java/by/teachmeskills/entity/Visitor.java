package by.teachmeskills.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "person_visitor_id")
@Table(schema = "test", name = "visitor")
public class Visitor extends User {

    @Column(name = "sum")
    private BigDecimal sum;


}

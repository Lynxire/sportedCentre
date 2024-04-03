package by.teachmeskills.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@Data
@Entity
@Table(schema = "test", name = "visitor")
@PrimaryKeyJoinColumn(name = "visitor_id")
public class Visitor extends User {

}

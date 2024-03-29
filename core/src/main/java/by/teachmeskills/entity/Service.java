package by.teachmeskills.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "test", name = "service")
public class Service {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long sum;


}

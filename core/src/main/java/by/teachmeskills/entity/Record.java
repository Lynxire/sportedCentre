package by.teachmeskills.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;

@Data
@Entity
@Table(schema = "test", name = "record")
public class Record {
    @GeneratedValue
    @Id
    private Long id;
    private LocalDate date;
    private Time time;

    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private User user;

    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private Room room;

}

package by.teachmeskills.entity;

import by.teachmeskills.entity.status.RoomStatus;
import by.teachmeskills.entity.status.UserStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "test", name = "room")
public class Room {
    @Id
    private Long id;
    private String name;
    private Long number;
    private Long identificationNumber;
    private Long maxPeople;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;
    private Long priceByHour;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    private Service service;




}

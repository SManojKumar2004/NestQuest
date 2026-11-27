package com.nestquest.entity;


import java.math.BigDecimal;
import java.util.List;

import com.nestquest.enums.RoomStatus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    private String roomNumber;

    private BigDecimal rentPerMonth;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id")
    private Property property;

   
    @OneToMany(mappedBy = "room")
    private List<Bed> beds;
}


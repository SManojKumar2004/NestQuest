package com.nestquest.entity;

import java.util.List;

import com.nestquest.enums.BedStatus;

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
public class Bed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bedId;

	private String bedLabel;

	@Enumerated(EnumType.STRING)
	private BedStatus status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	private Room room;

	@OneToMany(mappedBy = "bed")
	private List<Booking> bookings;
}

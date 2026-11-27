package com.nestquest.entity;


import java.util.List;
import java.util.Set;

import com.nestquest.enums.PropertyStatus;

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
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer propertyId;

    private String name;

    private String city;

    @Enumerated(EnumType.STRING)
    private PropertyStatus status;

   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;

   
    @OneToMany(mappedBy = "property")
    private List<Review> reviews;

   
    @OneToMany(mappedBy = "property")
    private List<Complaint> complaints;

   
    @OneToMany(mappedBy = "property")
    private List<PropertyImage> images;

   
    @OneToMany(mappedBy = "property")
    private List<Room> rooms;

   
    @ManyToMany
    @JoinTable(
        name = "property_amenity",
        joinColumns = @JoinColumn(name = "property_id"),
        inverseJoinColumns = @JoinColumn(name = "amenity_id")
    )
    private Set<Amenity> amenities;
}

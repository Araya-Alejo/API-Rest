package com.example.apirest.entities;

import com.example.apirest.repositories.LocationRepository;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Address extends Base {

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private int number;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_location")
    private Location location;
}

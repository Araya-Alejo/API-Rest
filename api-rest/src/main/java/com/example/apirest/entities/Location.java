package com.example.apirest.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "location")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Location extends Base{

    @Column(name = "denomination")
    private String denomination;

}

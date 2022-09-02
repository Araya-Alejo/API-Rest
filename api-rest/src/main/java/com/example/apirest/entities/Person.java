package com.example.apirest.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "person" )
@AllArgsConstructor @NoArgsConstructor @Builder @Getter @Setter
@Audited
public class Person extends Base {

	@Column( name = "first_name" )
	private String first_name;

	@Column( name = "last_name" )
	private String last_name;

	@Column( name = "dni" )
	private int dni;

}

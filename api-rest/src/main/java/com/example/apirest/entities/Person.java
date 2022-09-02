package com.example.apirest.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "person" )
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Audited
public class Person extends Base {

	@Column( name = "first_name" )
	private String first_name;

	@Column( name = "last_name" )
	private String last_name;

	@Column( name = "dni" )
	private int dni;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_address")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "person_book",
			joinColumns = @JoinColumn(name = "person_id"),
			inverseJoinColumns = @JoinColumn(name = "book_id")
	)
	private List<Book> books = new ArrayList<Book>();

}

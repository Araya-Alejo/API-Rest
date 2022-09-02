package com.example.apirest.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "author" )
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Audited
public class Author extends Base {

	@Column(name = "name")
	private String name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "biography", length = 1500)
	private String biography;

}

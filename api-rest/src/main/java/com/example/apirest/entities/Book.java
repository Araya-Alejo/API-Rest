package com.example.apirest.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@AllArgsConstructor @NoArgsConstructor @Builder @Getter @Setter
@Audited
public class Book extends Base {

    @Column(name = "date")
    private int date;

    @Column(name = "gender")
    private String gender;

    @Column(name = "pages")
    private int pages;

    @Column(name = "title")
    private String title;

}

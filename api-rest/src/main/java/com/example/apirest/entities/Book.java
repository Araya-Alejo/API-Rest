package com.example.apirest.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors;
}

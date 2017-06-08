package jpa.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by DELL on 06/08/17.
 */
@Entity
@Table(name = "bookdetail")
public class BookDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "price")
    private int price;

    @Column(name = "numberOfPage")
    private int numberOfPage;

    @Column(name = "publishDate")
    private Date publishDate;

    @OneToOne(mappedBy = "bookDetailEntity")
    private BookEntity bookEntity;
}

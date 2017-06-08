package jpa.entity;

import javax.persistence.*;

/**
 * Created by DELL on 06/08/17.
 */
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @ManyToOne
    @JoinColumn(name = "catagoryId")
    private CategoryEntity catagory;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private BookDetailEntity bookDetailEntity;

    public BookEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CategoryEntity getCatagory() {
        return catagory;
    }

    public void setCatagory(CategoryEntity catagory) {
        this.catagory = catagory;
    }

    public BookDetailEntity getBookDetailEntity() {
        return bookDetailEntity;
    }

    public void setBookDetailEntity(BookDetailEntity bookDetailEntity) {
        this.bookDetailEntity = bookDetailEntity;
    }
}

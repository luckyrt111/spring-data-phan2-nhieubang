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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }
}

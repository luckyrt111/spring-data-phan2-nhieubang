package jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by DELL on 06/08/17.
 */
@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "catagory", fetch = FetchType.EAGER)
    private List<BookEntity> bookEntityList;
}

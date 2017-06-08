package jpa.repository;

import jpa.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by DELL on 06/08/17.
 */
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
}

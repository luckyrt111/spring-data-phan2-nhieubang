package jpa;

import jpa.config.SpringConfig;
import jpa.entity.BookDetailEntity;
import jpa.entity.BookEntity;
import jpa.entity.CategoryEntity;
import jpa.repository.BookRepository;
import jpa.repository.CatagoryRepasitory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by DELL on 06/08/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CatagoryRepasitory catagoryRepasitory = context.getBean("catagoryRepasitory",CatagoryRepasitory.class);
        BookRepository bookRepository = context.getBean("bookRepository",BookRepository.class);
//
//        CategoryEntity categoryEntity = new CategoryEntity();
////        categoryEntity.setName("Hanh dong");
////        categoryEntity.setDescription("123");
//        categoryEntity.setId(1);
//
//        BookDetailEntity detailEntity = new BookDetailEntity();
//        detailEntity.setNumberOfPage(12);
//        detailEntity.setPrice(123);
//
//        BookEntity bookEntity = new BookEntity();
//        bookEntity.setName("JAva");
//        bookEntity.setAuthor("a");
//        bookEntity.setId(3);
//        bookEntity.setCatagory(categoryEntity);
//        bookEntity.setBookDetailEntity(detailEntity);
//        detailEntity.setBookEntity(bookEntity);

        //bookRepository.save(bookEntity);



        //lay category name cua book co id =1;
        BookEntity found = bookRepository.findOne(1);
        System.out.println(found.getCatagory().getName());

        //lay tat ca sach thuoc catagoryId = 1

        CategoryEntity found2 = catagoryRepasitory.findOne(1);
        System.out.println(found2.getBookEntityList());

        System.out.println("Xong");
    }

}

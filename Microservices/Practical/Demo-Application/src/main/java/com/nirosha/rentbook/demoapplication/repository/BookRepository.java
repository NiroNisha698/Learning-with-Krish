package com.nirosha.rentbook.demoapplication.repository;

import com.nirosha.rentbook.demoapplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface BookRepository extends JpaRepository<Book,Integer> {

}

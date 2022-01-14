package com.nirosha.rentbook.demoapplication.service;

import com.nirosha.rentbook.demoapplication.model.Book;
import com.nirosha.rentbook.demoapplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book fetchBookById(int id){
      Optional<Book> book =  bookRepository.findById(id);
      if(book.isPresent()){
          return book.get();
      }
      return null;
    }
}

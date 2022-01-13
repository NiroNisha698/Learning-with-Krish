package com.nirosha.rentbook.demoapplication.service;

import com.nirosha.rentbook.demoapplication.model.Book;
import com.nirosha.rentbook.demoapplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}

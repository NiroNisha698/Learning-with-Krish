package com.nirosha.rentbook.demoapplication.service;

import com.nirosha.rentbook.demoapplication.model.Book;

public interface BookService {
    Book save(Book book);
    Book fetchBookById(int id);

}

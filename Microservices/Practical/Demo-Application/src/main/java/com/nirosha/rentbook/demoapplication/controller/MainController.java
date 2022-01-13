package com.nirosha.rentbook.demoapplication.controller;

import com.nirosha.rentbook.demoapplication.model.Book;
import com.nirosha.rentbook.demoapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Spring Boot from, GET";

    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Spring Boot from, POST";

    }

    @RequestMapping(value = "/book" , method = RequestMethod.POST)
    public Book save(@RequestBody Book book){
     return bookService.save(book);
    }
}

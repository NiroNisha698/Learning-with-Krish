package com.nirosha.rentbook.demoapplication.controller;

import com.nirosha.rentbook.demoapplication.model.Book;
import com.nirosha.rentbook.demoapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ResponseEntity<Book> fetchStudent(@RequestParam int id){

        Book book = bookService.fetchBookById(id);
        if(book == null){
           return ResponseEntity.notFound().build();
        }else{
           return ResponseEntity.ok().body(book);
        }
    }
}

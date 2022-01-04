package com.nirosha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatingController {

    @RequestMapping("/")
    public String greeting(){
        return "<h1> Hi Nirosha. Welcome to game changing framework Spring Boot!!!!! </h1>";
    }
}

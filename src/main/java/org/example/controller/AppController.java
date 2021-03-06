package org.example.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    @GetMapping("/")
    @ApiOperation("This is the hello world api")
    public String hello() {
        return "A simple RestApi Crud app using Spring Boot.";
    }

}

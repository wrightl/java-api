package com.myfirstapi.myfirstapi.Resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyFirstApiController {
    
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name")  String name) {
        return String.format("hello %s", name);
    }
}


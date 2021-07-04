package com.course.practicaljava.api.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DefaultRestApi {

    @RequestMapping(value = "/api/welcome")
    public String welcome(){
        return  "Welcome to Spring Boot";
    }
}

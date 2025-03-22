package com.spring.spring_boot_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "test/hello")
    public String helloWorld(){
        return "Hello World from Spring boot";
    }
}

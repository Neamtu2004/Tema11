package com.example.demo.ex2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(method = RequestMethod.GET,path="hello-world")
    public String helloWorld() {
        return"Hello world!";
    }
}

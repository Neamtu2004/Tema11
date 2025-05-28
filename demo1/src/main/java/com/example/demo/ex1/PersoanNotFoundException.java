package com.example.demo.ex1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class PersoanNotFoundException extends RuntimeException {
    public PersoanNotFoundException(String mesaj) {
        super(mesaj);
    }

}

package com.example.demo.ex3;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class EvenimenteNotFoundException extends RuntimeException {
    public EvenimenteNotFoundException(String mesaj) {
        super(mesaj);
    }
}

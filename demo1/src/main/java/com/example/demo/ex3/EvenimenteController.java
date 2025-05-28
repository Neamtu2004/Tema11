package com.example.demo.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
public class EvenimenteController {
    @Autowired
    EvenimenteRepository repo;
    //1
    @GetMapping("jpa/Evenimente")
    public List<Evenimente> findAll() {
        return repo.findAll();
    }
    //2
    @GetMapping("jpa/Evenimente/locatia/{locatia}")
    public List<Evenimente> findByLocatia(@PathVariable String locatia) {
        List<Evenimente> evenimente = repo.findByLocatia(locatia);
        if (!evenimente.isEmpty()) {
            return evenimente;
        } else {
            throw new EvenimenteNotFoundException("Evenimentele cu locația '" + locatia + "' nu au fost găsite");
        }
    }
        //3
    @GetMapping("jpa/Evenimente/data/{data}")
    public List<Evenimente> findByData(@PathVariable LocalDateTime data) {
        List<Evenimente> eveniment = repo.findByData(data);
        if (!eveniment.isEmpty()) {
            return eveniment;
        } else {
            throw new EvenimenteNotFoundException("Evenimentul cu data " + data + " nu a fost gasita");
        }
    }
        //4
    //curl -X POST http://localhost:8081/jpa/Evenimente -H "Content-Type: application/json" -d "{\"denumire\":\"Concert Jazz\",\"locatia\":\"Sala Mare\",\"data\":\"2025-12-01T20:00:00\",\"timpul\":\"2025-12-01T19:30:00\",\"pret\":180}"
        @PostMapping("jpa/Evenimente")
        public Evenimente save(@RequestBody Evenimente evenimente) {
        return repo.save(evenimente);
        }
        //6
    //curl -X DELETE http://localhost:8081/jpa/Evenimente/delete/3
        @DeleteMapping("jpa/Evenimente/delete/{id}")
        public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
        }

    }


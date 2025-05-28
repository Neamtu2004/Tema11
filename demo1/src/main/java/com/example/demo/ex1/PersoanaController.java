package com.example.demo.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersoanaController {
    @Autowired
    PersoanaDaoService service;

    @GetMapping("persoane")
    public List<Persoane> findAll() {
        return service.FindAll();
    }

    @GetMapping("persoane/{id}")
    public Persoane findById(@PathVariable int id) {
        Persoane persoane = service.findById(id);
        if (persoane == null) {
            throw new PersoanNotFoundException("Persoana cu id " + id + " not found");
        }
        return persoane;
    }

    @PostMapping("persoane")
    public void savePersoana(@RequestBody Persoane persoana) {
        service.Save(persoana);
    }

    @DeleteMapping("persoane/{id}")
    public void deleteById(@PathVariable int id) {
        boolean isSters = service.delete(id);
        if (!isSters)
            throw new PersoanNotFoundException("Persoana cu id-ul " + id + " nu a fost stearsa ptr ca nu a fost gasita");
    }
}

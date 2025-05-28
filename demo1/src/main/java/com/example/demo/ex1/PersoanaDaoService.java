package com.example.demo.ex1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class PersoanaDaoService {
    private static List<Persoane> persoane = new ArrayList<>();

    static {
        persoane.add(new Persoane(1, "Oana", 20));
        persoane.add(new Persoane(2, "Vlad", 17));
        persoane.add(new Persoane(3, "Maria", 30));
    }

    List<Persoane> FindAll() {
        return persoane;
    }

    public Persoane findById(int id) {
        Optional<Persoane> optionaPersoane = persoane.stream().filter(p -> p.getId() == id).findFirst();
        return optionaPersoane.orElse(null);
    }
    public void Save(Persoane persoana) {
        persoane.add(persoana);
    }
    public boolean delete(int id) {
        return persoane.removeIf(p -> p.getId() == id);
    }
}

package com.example.demo.ex3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface EvenimenteRepository extends JpaRepository<Evenimente, Integer> {
    List<Evenimente> findByLocatia(String locatia);
    List<Evenimente>findByData(LocalDateTime data);
}

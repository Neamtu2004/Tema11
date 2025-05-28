package com.example.demo.ex3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="bd_evenimente")
public class Evenimente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String denumire;
    private String locatia;
    private LocalDateTime data;
    private LocalDateTime timpul;
    private int pret;

    public Evenimente() {
    }

    public Evenimente(int id, LocalDateTime timpul, LocalDateTime data, String denumire, String locatia, int pret) {
        this.id = id;
        this.timpul = timpul;
        this.data = data;
        this.denumire = denumire;
        this.locatia = locatia;
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getLocatia() {
        return locatia;
    }

    public void setLocatia(String locatia) {
        this.locatia = locatia;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getTimpul() {
        return timpul;
    }

    public void setTimpul(LocalDateTime timpul) {
        this.timpul = timpul;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Evenimente{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", locatia='" + locatia + '\'' +
                ", data=" + data +
                ", timpul=" + timpul +
                ", pret=" + pret +
                '}';
    }

}

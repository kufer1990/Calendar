package com.example.calendarproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class OneOfManyDays {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @JsonFormat(pattern="yyyy/MM/dd")
    private LocalDate currentday = LocalDate.now();

    private String event;
    @Transient
    ArrayList<String> list;

    public OneOfManyDays() {
    }

    public OneOfManyDays(String event) {
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return currentday;
    }


    public ArrayList<String> getList() {
        return list;
    }

    public void addEvent(String event){
        list.add(event);
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}

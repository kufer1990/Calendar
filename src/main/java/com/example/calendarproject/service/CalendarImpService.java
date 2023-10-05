package com.example.calendarproject.service;

import com.example.calendarproject.model.OneOfManyDays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CalendarImpService  {
    @Autowired
    private CalendarRepository calendarRepository;

    public void saveNewEvent(OneOfManyDays oneOfManyDays){
        calendarRepository.save(oneOfManyDays);
    }
}

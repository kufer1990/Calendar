package com.example.calendarproject.controler;

import com.example.calendarproject.model.OneOfManyDays;
import com.example.calendarproject.service.CalendarImpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {
    @Autowired
    CalendarImpService calendarImpService;

    @GetMapping("/main")
    public String addObject(@RequestBody OneOfManyDays oneOfManyDays){
        String eventpass ="newEvent";
        calendarImpService.saveNewEvent(oneOfManyDays);
        return eventpass;
    }

}

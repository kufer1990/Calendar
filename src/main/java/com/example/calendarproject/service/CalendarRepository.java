package com.example.calendarproject.service;

import com.example.calendarproject.model.OneOfManyDays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<OneOfManyDays, Long> {
}

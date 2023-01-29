package com.event.management.eventmanagement.service;

import com.event.management.eventmanagement.dto.SubEventDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubEventService {
    public List<SubEventDto> getAllSubEvent();
    public SubEventDto addNewSubEvent(SubEventDto subEventDto);
}

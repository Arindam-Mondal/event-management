package com.event.management.eventmanagement.controller;

import com.event.management.eventmanagement.dto.SubEventDto;
import com.event.management.eventmanagement.service.SubEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class EventManagementController {

    @Autowired
    SubEventService subEventService;

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/sub-event")
    ResponseEntity<List<SubEventDto>> getAllSubEvent() {
        return ResponseEntity.ok(subEventService.getAllSubEvent());
    }

    @PostMapping("/sub-event")
    ResponseEntity<SubEventDto> addNewSubEvent(@RequestBody SubEventDto subEventDto) {
        return ResponseEntity.ok(subEventService.addNewSubEvent(subEventDto));
    }
}

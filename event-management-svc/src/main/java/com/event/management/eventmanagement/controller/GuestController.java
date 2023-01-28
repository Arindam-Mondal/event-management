package com.event.management.eventmanagement.controller;

import com.event.management.eventmanagement.dto.GuestDto;
import com.event.management.eventmanagement.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {

    @Autowired
    GuestService guestService;

    @GetMapping("/guest")
    ResponseEntity<List<GuestDto>> getAllGuest() {
        return ResponseEntity.ok(guestService.getAllGuestDetails());
    }

    @PostMapping("/guest")
    ResponseEntity<GuestDto> addNewGuest(@RequestBody GuestDto guestDto){
        return ResponseEntity.ok(guestService.addGuest(guestDto));
    }
}

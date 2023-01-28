package com.event.management.eventmanagement.service;

import com.event.management.eventmanagement.dto.GuestDto;
import com.event.management.eventmanagement.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GuestService {
    public List<GuestDto> getAllGuestDetails();
    public GuestDto addGuest(GuestDto guestDto);
}

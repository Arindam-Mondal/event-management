package com.event.management.eventmanagement.service.impl;

import com.event.management.eventmanagement.dto.GuestDto;
import com.event.management.eventmanagement.entity.Guest;
import com.event.management.eventmanagement.repository.GuestRepository;
import com.event.management.eventmanagement.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    GuestRepository guestRepository;

    @Override
    public List<GuestDto> getAllGuestDetails() {
        List<Guest> guestList = guestRepository.findAll();
        List<GuestDto> guestDtoList = new ArrayList<>();
        guestList.stream().forEach(guest->{
            GuestDto guestDto = GuestDto.builder()
                    .name(guest.getName())
                    .adult(guest.getAdult())
                    .child(guest.getChild())
                    .build();
            guestDtoList.add(guestDto);
        });
        return guestDtoList;
    }

    @Override
    public GuestDto addGuest(GuestDto guestDto) {
        Guest guestEntity = Guest.builder()
                .name(guestDto.getName())
                .adult(guestDto.getAdult())
                .child(guestDto.getChild())
                .build();

        guestRepository.save(guestEntity);
        return guestDto;
    }
}

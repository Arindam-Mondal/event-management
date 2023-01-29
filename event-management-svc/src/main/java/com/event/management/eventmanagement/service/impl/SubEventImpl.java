package com.event.management.eventmanagement.service.impl;

import com.event.management.eventmanagement.dto.SubEventDto;
import com.event.management.eventmanagement.entity.SubEvent;
import com.event.management.eventmanagement.repository.SubEventRepository;
import com.event.management.eventmanagement.service.SubEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubEventImpl implements SubEventService {
    @Autowired
    SubEventRepository subEventRepository;

    @Override
    public List<SubEventDto> getAllSubEvent() {
        List<SubEvent> subEventList = subEventRepository.findAll();
        List<SubEventDto> subEventDtoList = new ArrayList<>();
        subEventList.stream().forEach((subEvent) ->{
            SubEventDto subEventDto = SubEventDto.builder()
                    .subEventDate(subEvent.getSubEventDate())
                    .name(subEvent.getName())
                    .build();
        });
        return subEventDtoList;
    }

    @Override
    public SubEventDto addNewSubEvent(SubEventDto subEventDto) {
        SubEvent subEvent = SubEvent.builder()
                .name(subEventDto.getName())
                .subEventDate(subEventDto.getSubEventDate())
                .build();

        subEventRepository.save(subEvent);
        return subEventDto;
    }
}

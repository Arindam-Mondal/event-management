package com.event.management.eventmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class SubEventDto {
    String name;
    LocalDate subEventDate;
}

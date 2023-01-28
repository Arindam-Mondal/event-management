package com.event.management.eventmanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GuestDto {
    String name;
    int adult;
    int child;
}

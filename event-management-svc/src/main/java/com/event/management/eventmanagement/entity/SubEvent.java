package com.event.management.eventmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubEvent {
    @Id
    @SequenceGenerator(name="sub_event_seq_generator", sequenceName="sub_event_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sub_event_seq_generator")
    Long id;
    String name;
    LocalDate subEventDate;
}

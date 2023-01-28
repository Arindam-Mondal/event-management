package com.event.management.eventmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    @Id
    @SequenceGenerator(name="guest_seq_generator", sequenceName="guest_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guest_seq_generator")
    Long id;
    String name;
    int adult;
    int child;
}

package com.event.management.eventmanagement.repository;

import com.event.management.eventmanagement.entity.SubEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubEventRepository extends JpaRepository<SubEvent,Long> {
}

package com.umaraliev.springresertapiapplication.repository;

import com.umaraliev.springresertapiapplication.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}

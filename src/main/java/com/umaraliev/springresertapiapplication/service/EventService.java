package com.umaraliev.springresertapiapplication.service;

import com.umaraliev.springresertapiapplication.model.Event;
import com.umaraliev.springresertapiapplication.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event getById(Long id) {
        return eventRepository.getById(id);
    }

    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    public Event save(Event event) {
        return eventRepository.save(event);
    }

//    public void delete(Long id) {
//        eventRepository.delete(id);
//    }
}

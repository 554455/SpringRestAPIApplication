package com.umaraliev.springresertapiapplication.controllers;

import com.umaraliev.springresertapiapplication.model.Event;
import com.umaraliev.springresertapiapplication.model.File;
import com.umaraliev.springresertapiapplication.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping("/list")
    public List<Event> getAll() {
        return eventService.getAll();
    }

    @RequestMapping("/{id}")
    public Event getById(@PathVariable("id") Long id) {
        return eventService.getById(id);
    }

    @PostMapping("/create-event")
    public Event save(@RequestBody Event event) {
        return eventService.save(event);
    }

    @DeleteMapping("/delete-event/{id}")
    public void delete(@PathVariable Long id) {
        eventService.getById(id);
    }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/topics")
    public Flux<Event> getTopics() {
        return eventRepository.findAll();
    }
}

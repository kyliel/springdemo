package com.example.demo;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends ReactiveCosmosRepository<Event, String> {

}


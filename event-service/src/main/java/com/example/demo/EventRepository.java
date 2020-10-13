package com.example.demo;

import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends ReactiveCosmosRepository<Event, String> {

}


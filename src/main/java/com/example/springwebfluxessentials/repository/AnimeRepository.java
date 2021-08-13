package com.example.springwebfluxessentials.repository;

import com.example.springwebfluxessentials.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;


public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {

    @Override
    Mono<Anime> findById(Integer integer);
}

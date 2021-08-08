package com.example.springwebfluxessentials.repository;

import com.example.springwebfluxessentials.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
}

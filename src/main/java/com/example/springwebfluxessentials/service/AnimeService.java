package com.example.springwebfluxessentials.service;

import com.example.springwebfluxessentials.domain.Anime;
import com.example.springwebfluxessentials.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;


    public Flux<Anime> findAll() {
        return animeRepository.findAll();
    }
}

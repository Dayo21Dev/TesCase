package com.example.studyCase.controllers;

import com.example.studyCase.Dto.ArtikelDto;
import com.example.studyCase.Models.Output;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    WebClient webClient = WebClient.create("https://60ee7679eb4c0a0017bf442f.mockapi.io");

    @GetMapping()
    Mono<Output> getArtikel(ArtikelDto artikelDto){
        return webClient
                .get()
                .uri("/articles?page=1&limit=2")
                .retrieve()
                .bodyToMono(Output.class);
    }
}

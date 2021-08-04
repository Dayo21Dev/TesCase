package com.example.studyCase.controllers;

import com.example.studyCase.Dto.ArtikelDto;
import com.example.studyCase.Models.Output;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/artikel")
public class ArtikelController {
    WebClient webClient = WebClient.create("https://60ee7679eb4c0a0017bf442f.mockapi.io");

    @PostMapping()
    Mono<Output> postArtikel(@RequestBody ArtikelDto artikelDto){
        return webClient
                .get()
                .uri("/articles?page="+artikelDto.getHalaman()+"&limit="+artikelDto.getJumlah())
                .retrieve()
                .bodyToMono(Output.class);
    }


}

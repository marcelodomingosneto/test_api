package com.teste.teste.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/people")
public class Controller {
    @GetMapping
    public String getBook() {
        return "Teste com sucesso!";
    }
}





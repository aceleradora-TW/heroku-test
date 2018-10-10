package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class herokuController {

    @GetMapping("/")
    public String renderizaPaginaInicial() {
        return "index";
    }
}
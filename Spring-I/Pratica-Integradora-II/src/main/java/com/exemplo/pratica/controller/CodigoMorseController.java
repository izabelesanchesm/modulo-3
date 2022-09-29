package com.exemplo.pratica.controller;

import com.exemplo.pratica.util.ConversorCodigoMorseParaPortugues;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class CodigoMorseController {

    @GetMapping("{morse}")
    public String retornaParaPortugues(@PathVariable String morse){
        return ConversorCodigoMorseParaPortugues.conversor(morse);
    }

}

package com.exemplo.pratica.controller;

import com.exemplo.pratica.util.ConversorNumeroDecimalEmRomano;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversor")
public class NumerosRomanosController {

    @GetMapping("/{decimal}")
    public String conversor(@PathVariable int decimal){
        //return "teste " + decimal;
        return "O número " + decimal + " em numeral romano é " + ConversorNumeroDecimalEmRomano.conversor(decimal);
    }

}

package org.treinamentoSpring.testeSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraRota {
    @GetMapping("/")
    public String primeiraRotaGet() {
        return "Primeira Rota Get com Spring!";
    }

}

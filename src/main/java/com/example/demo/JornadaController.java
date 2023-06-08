package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class JornadaController {

    private JornadaRepository jornadaRepository;

    //BASICOS
    @GetMapping
    public List<Jornada> getAll() {
        return jornadaRepository.findAll();
    }

    @GetMapping("/add")
    public Jornada getAllDetails() {
        Jornada jornada = new Jornada();
        jornada.setHoras(2);
        return jornadaRepository.save(jornada);
    }

}
